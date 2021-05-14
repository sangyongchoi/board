package com.board.dev.domain.reply.service

import com.board.dev.common.exception.ForbiddenException
import com.board.dev.domain.post.entity.Post
import com.board.dev.domain.post.repository.PostRepository
import com.board.dev.domain.reply.dto.ReplyRequestDto
import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.data.domain.PageRequest
import java.time.LocalDateTime

@SpringBootTest
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation::class)
internal class ReplyServiceTest {

    @Autowired
    lateinit var postRepository: PostRepository

    @Autowired
    lateinit var replyService: ReplyService

    var postId: Long? = null

    @BeforeAll
    fun setUp() {
        insertDummyData()
    }

    private fun insertDummyData() {
        val contents = Post.Companion.Contents(1, LocalDateTime.now(), LocalDateTime.now(), "")
        postId = postRepository.save(Post(1L, "csytest", contents)).id

        for(i in 1..10) {
            insertReply("csytest1")
        }
    }

    private fun insertReply(writerId: String): Long {
        val request = ReplyRequestDto.CreateRequest(postId!!, writerId, "100")
        return replyService.write(request).id!!
    }

    @Test
    @Order(1)
    fun `댓글 가져오기`() {
        val pageable = PageRequest.of(0, 50)

        val replies = replyService.findRepliesByPostId(postId!!, pageable)

        assertEquals(10,replies.content.size)
        assertTrue(replies.isLast)
    }

    @Test
    @Order(2)
    fun `댓글 작성 테스트`() {
        val request = ReplyRequestDto.CreateRequest(postId!!, "csytest2", "100")
        val result = replyService.write(request)

        assertNotNull(result.id)
    }

    @Test
    @Order(3)
    fun `작성자가 아닐때 수정 실패`() {
        assertThrows<ForbiddenException> {
            val replyId = insertReply("csytest1")
            val request = ReplyRequestDto.ModifyRequest(replyId,  "ddd")

            replyService.modify(request, "csytest2")
        }
    }

    @Test
    @Order(4)
    fun `작성자일 때 수정`() {
        val replyId = insertReply("csytest1")
        val request = ReplyRequestDto.ModifyRequest(replyId, "ddd")

        replyService.modify(request, "csytest1")

        // success
    }

    @Test
    @Order(5)
    fun `작성자가 아닐때 삭제 실패`() {
        assertThrows<ForbiddenException> {
            val replyId = insertReply("csytest1")
            val request = ReplyRequestDto.DeleteRequest(replyId)

            replyService.delete("csytest2", request)
        }
    }

    @Test
    @Order(6)
    fun `작성자일 때 삭제`() {
        val replyId = insertReply("csytest1")
        val request = ReplyRequestDto.DeleteRequest(replyId)

        replyService.delete("csytest1", request)

        // success
    }
}