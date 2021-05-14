package com.board.dev.controller.post

import com.board.dev.common.config.argument.UserId
import com.board.dev.common.dto.PageResponse
import com.board.dev.domain.post.entity.Post
import com.board.dev.domain.post.service.PostService
import org.springframework.data.domain.PageRequest
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
class PostController(
    private val postService: PostService
) {

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/post")
    fun write(@RequestBody postInfo: PostRequestDto.PostInfo): PostResponseDto.CreatedPost {
        val post = postInfo.convertToPost()
        val postId = postService.write(post)

        return PostResponseDto.CreatedPost(postId)
    }

    @GetMapping("/posts/my/{page}")
    fun getMyWrittenList(@RequestParam userId: String, @PathVariable("page") page: Int): PageResponse<Post> {
        val pageable = PageRequest.of(page, 30)
        val writtenList = postService.findMyWrittenList(userId, pageable)

        return PageResponse(writtenList)
    }

    @GetMapping("/posts/{page}")
    fun getPostList(@PathVariable("page") page: Int): PageResponse<Post> {
        val pageable = PageRequest.of(page, 30)
        val postList = postService.findPostList(pageable)

        return PageResponse(postList)
    }

    @PutMapping("/post")
    fun modify(@UserId userId: String, @RequestBody request: PostRequestDto.ModifyRequest): ResponseEntity<String> {
        postService.modify(request, userId)

        return ResponseEntity
            .ok()
            .body("success")
    }

    @DeleteMapping("/post")
    fun delete(@UserId userId: String, @RequestBody request: PostRequestDto.DeleteRequest): ResponseEntity<String> {
        postService.delete(request, userId)

        return ResponseEntity
            .ok()
            .body("success")
    }
}