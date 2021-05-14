package com.board.dev.domain.reply.dto

object ReplyRequestDto {

    data class CreateRequest(
        val postId: Long,
        val writerId: String,
        val contents: String
    )

    data class ModifyRequest(
        val replyId: Long,
        val contents: String
    )

    data class DeleteRequest(
        val replyId: Long
    )
}