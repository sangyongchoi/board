package com.board.dev.domain.reply.dto

import java.time.LocalDateTime

object ReplyResponseDto {

    data class ReplyInfo(
        val writerId: String,
        val contents: String,
        val createdAt: LocalDateTime
    )
}