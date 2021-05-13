package com.board.dev.domain.reply.repository

import com.board.dev.domain.post.entity.Post
import com.board.dev.domain.post.repository.PostRepository
import com.board.dev.domain.reply.dto.ReplyRequestDto
import com.board.dev.domain.reply.service.ReplyService
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.data.domain.PageRequest
import java.time.LocalDateTime

@SpringBootTest
internal class ReplyRepositoryImplTest {

    @Autowired
    lateinit var postRepository: PostRepository

    @Autowired
    lateinit var replyService: ReplyService

    @Autowired
    lateinit var replyRepository: ReplyRepository

    var postId:Long? = null

    @BeforeEach
    fun setUp() {
        insertDummyData()
    }

    private fun insertDummyData() {
        val contents = Post.Companion.Contents(1, LocalDateTime.now(), LocalDateTime.now(), "")
        postId = postRepository.save(Post(1L, "csytest", contents)).id

        for(i in 1..10) {
            val request = ReplyRequestDto.CreateRequest(postId!!, "csytest1", "100")
            replyService.write(request)
        }
    }

    @Test
    fun `댓글 가져오기`() {
        val result = replyRepository.findByPostId(postId!!, PageRequest.of(0, 20))

        assertEquals(10, result.content.size)
        assertTrue(result.isLast)
    }
}