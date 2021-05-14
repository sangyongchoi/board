package com.board.dev.domain.post.service

import com.board.dev.common.exception.ForbiddenException
import com.board.dev.controller.post.PostRequestDto
import com.board.dev.domain.post.entity.Post
import com.board.dev.domain.post.repository.PostRepository
import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.data.domain.PageRequest
import java.time.LocalDateTime

@SpringBootTest
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation::class)
internal class PostServiceTest {

    @Autowired
    lateinit var postRepository: PostRepository

    @Autowired
    lateinit var postService: PostService

    @BeforeAll
    fun setUp() {
        insertDummyData()
    }

    private fun insertDummyData() {
        for(i in 1..5) {
            insertPost("csytest", i)
        }
    }

    private fun insertPost(writerId: String, homeSize: Int ): Long {
        val contents = Post.Companion.Contents(homeSize, LocalDateTime.now(), LocalDateTime.now(), "")
        val post = Post(null, writerId, contents)
        return postRepository.save(post).id!!
    }

    @Test
    @Order(1)
    fun `내 게시글 조회`() {
        val userId = "csytest"
        val pageable = PageRequest.of(0, 20)

        val result = postService.findMyWrittenList(userId, pageable)

        assertEquals(5, result.content.size)
        assertTrue(result.isLast)
    }

    @Test
    @Order(2)
    fun `내 게시글 조회 - 없을 때`() {
        val userId = "csytest1"
        val pageable = PageRequest.of(0, 20)

        val result = postService.findMyWrittenList(userId, pageable)

        assertEquals(0, result.content.size)
        assertTrue(result.isLast)
    }

    @Test
    @Order(3)
    fun `모든 게시글 조회`() {
        val pageable = PageRequest.of(0, 20)

        val result = postService.findPostList(pageable)

        assertEquals(5, result.content.size)
        assertTrue(result.isLast)
    }

    @Test
    @Order(4)
    fun `글 작성`() {
        // given
        val contents = Post.Companion.Contents(4, LocalDateTime.now(), LocalDateTime.now(), "")
        val post = Post(null, "test", contents)

        // when
        val postId = postService.write(post)

        // then
        assertNotNull(postId)
    }

    @Test
    @Order(5)
    fun `작성자가 아닐때 글 수정 실패`() {
        assertThrows<ForbiddenException> {
            val postId = insertPost("csytest1", 20)
            val request = PostRequestDto.ModifyRequest(postId, 30, LocalDateTime.now(), LocalDateTime.now(), "123123")

            postService.modify(request, "csytest2")
        }
    }

    @Test
    @Order(6)
    fun `작성자일 때 글 수정`() {
        val postId = insertPost("csytest1", 20)
        val request = PostRequestDto.ModifyRequest(postId, 30, LocalDateTime.now(), LocalDateTime.now(), "123123")

        postService.modify(request, "csytest1")

        // success
    }

    @Test
    @Order(7)
    fun `작성자가 아닐때 글 삭제 실패`() {
        assertThrows<ForbiddenException> {
            val postId = insertPost("csytest1", 20)
            val request = PostRequestDto.DeleteRequest(postId)

            postService.delete(request, "csytest2")
        }
    }

    @Test
    @Order(8)
    fun `작성자일 때 글 삭제`() {
        val postId = insertPost("csytest1", 20)
        val request = PostRequestDto.DeleteRequest(postId)

        postService.delete(request, "csytest1")

        // success
    }
}