package com.board.dev.domain.reply.repository

import com.board.dev.domain.reply.entity.Reply
import org.springframework.data.repository.CrudRepository

interface ReplyRepository: CrudRepository<Reply, Long>, ReplyRepositoryCustom{
}