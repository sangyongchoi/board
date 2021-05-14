package com.board.dev.domain.reply.service

import com.board.dev.common.exception.BadRequestException
import com.board.dev.common.exception.ForbiddenException
import com.board.dev.domain.post.repository.PostRepository
import com.board.dev.domain.reply.dto.ReplyRequestDto
import com.board.dev.domain.reply.entity.Reply
import com.board.dev.domain.reply.repository.ReplyRepository
import org.springframework.data.domain.Pageable
import org.springframework.stereotype.Service

@Service
class ReplyService(
    private val replyRepository: ReplyRepository,
    private val postRepository: PostRepository
) {

    fun write(request: ReplyRequestDto.CreateRequest): Reply {
        val post = postRepository.findById(request.postId)
            .orElseThrow { throw BadRequestException("존재하지 않는 게시글입니다.") }
        val writerId = request.writerId
        val contents = request.contents
        val reply = Reply(null, post, writerId, contents )

        return replyRepository.save(reply)
    }

    fun findRepliesByPostId(postId: Long, pageable: Pageable) = replyRepository.findByPostId(postId, pageable)

    fun modify(request: ReplyRequestDto.ModifyRequest, userId: String) {
        val reply = replyRepository.findById(request.replyId)
            .orElseThrow{ throw BadRequestException("존재하지 않는 댓글입니다.") }

        val contents = request.contents
        reply.changeContents(userId, contents)
        replyRepository.save(reply)
    }

    fun delete(userId: String, request: ReplyRequestDto.DeleteRequest) {
        val replyId = request.replyId
        val reply = replyRepository.findById(replyId).orElseThrow{ throw BadRequestException("존재하지 않는 댓글입니다.") }

        if(!reply.isWriter(userId)) {
            throw ForbiddenException("작성자만 삭제 가능합니다.")
        }

        replyRepository.deleteById(replyId)
    }
}