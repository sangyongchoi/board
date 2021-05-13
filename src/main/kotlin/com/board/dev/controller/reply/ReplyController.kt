package com.board.dev.controller.reply

import com.board.dev.common.dto.PageResponse
import com.board.dev.domain.reply.dto.ReplyRequestDto
import com.board.dev.domain.reply.dto.ReplyResponseDto
import com.board.dev.domain.reply.service.ReplyService
import org.springframework.data.domain.PageRequest
import org.springframework.data.domain.Pageable
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
class ReplyController(
    private val replyService: ReplyService
) {

    @PostMapping("/reply")
    fun write(@RequestBody request: ReplyRequestDto.CreateRequest) = replyService.write(request).id!!

    @GetMapping("/replies/{postId}")
    fun getReplies(@PathVariable("postId") postId: Long, @RequestParam page: Int): PageResponse<ReplyResponseDto.ReplyInfo> {
        val pageable = PageRequest.of(page, 30)
        val repliesPageInfo = replyService.findRepliesByPostId(postId, pageable)

        return PageResponse(repliesPageInfo)
    }

    @PutMapping("/reply")
    fun modify(@RequestBody request: ReplyRequestDto.ModifyRequest): ResponseEntity<String> {
        replyService.modify(request)

        return ResponseEntity
            .ok()
            .body("success")
    }

    @DeleteMapping("/reply")
    fun delete(@RequestBody request: ReplyRequestDto.DeleteRequest): ResponseEntity<String> {
        replyService.delete(request)

        return ResponseEntity
            .ok()
            .body("success")
    }
}