package com.board.dev.domain.post.service

import com.board.dev.common.exception.BadRequestException
import com.board.dev.common.exception.ForbiddenException
import com.board.dev.controller.post.PostRequestDto
import com.board.dev.domain.post.entity.Post
import com.board.dev.domain.post.repository.PostRepository
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.stereotype.Service

@Service
class PostService(
    private val postRepository: PostRepository
) {

    fun write(post: Post): Long {
        val savedPost = postRepository.save(post)
        return savedPost.id!!
    }

    fun findMyWrittenList(userId: String, pageable: Pageable) = postRepository.findByWriterIdOrderByIdDesc(userId, pageable)

    fun findPostList(pageable: Pageable): Page<Post> {
        return postRepository.findAll(pageable)
    }

    fun modify(request: PostRequestDto.ModifyRequest, userId: String) {
        val post = postRepository.findById(request.postId)
            .orElseThrow{ throw BadRequestException("존재하지 않는 게시글입니다.") }

        val homeSize = request.homeSize
        val startDate = request.startDate
        val endDate = request.endDate
        val requirements = request.requirements
        val contents = Post.Companion.Contents(homeSize, startDate, endDate, requirements)

        post.modify(userId, contents)

        postRepository.save(post)
    }

    fun delete(request: PostRequestDto.DeleteRequest) {
        val postId = request.postId
        val post = postRepository.findById(postId)
            .orElseThrow{ throw BadRequestException("존재하지 않는 게시글입니다.") }

        if(!post.isWriter(request.userId)) {
            throw ForbiddenException("글 작성자만 삭제 가능합니다.")
        }

        postRepository.deleteById(postId)
    }
}