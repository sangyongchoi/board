package com.board.dev.domain.reply.repository

import com.board.dev.domain.reply.dto.ReplyResponseDto
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable

interface ReplyRepositoryCustom {
    fun findByPostId(postId: Long, pageable: Pageable): Page<ReplyResponseDto.ReplyInfo>
}