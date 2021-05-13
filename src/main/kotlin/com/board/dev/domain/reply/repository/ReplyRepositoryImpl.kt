package com.board.dev.domain.reply.repository

import com.board.dev.domain.post.entity.QPost
import com.board.dev.domain.reply.dto.ReplyResponseDto
import com.board.dev.domain.reply.entity.QReply
import com.querydsl.core.types.Projections
import com.querydsl.jpa.impl.JPAQuery
import com.querydsl.jpa.impl.JPAQueryFactory
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.data.support.PageableExecutionUtils

class ReplyRepositoryImpl(
    private val jpaQueryFactory: JPAQueryFactory
): ReplyRepositoryCustom {

    private val qReply = QReply.reply
    private val qPost = QPost.post

    override fun findByPostId(postId: Long, pageable: Pageable): Page<ReplyResponseDto.ReplyInfo> {
        val replies = getReplies(postId, pageable)
        val countQuery = countQuery(postId)

        return PageableExecutionUtils.getPage(replies, pageable, countQuery::fetchCount)
    }

    private fun getReplies(postId: Long, pageable: Pageable): List<ReplyResponseDto.ReplyInfo> {
        return jpaQueryFactory
            .select(
                Projections.constructor(
                    ReplyResponseDto.ReplyInfo::class.java,
                    qReply.writerId, qReply.contents, qReply.createdAt
                )
            )
            .from(qReply)
            .innerJoin(qPost).on(qReply.post.id.eq(qPost.id)).fetchJoin()
            .where(
                qReply.post.id.eq(postId)
            )
            .offset(pageable.offset)
            .limit(pageable.pageSize.toLong())
            .fetch()
    }

    private fun countQuery(postId: Long): JPAQuery<ReplyResponseDto.ReplyInfo> {
        return jpaQueryFactory
            .select(
                Projections.constructor(
                ReplyResponseDto.ReplyInfo::class.java,
                qReply.writerId, qReply.contents, qReply.createdAt
            ))
            .from(qReply)
            .where(
                qReply.post.id.eq(postId)
            )
    }
}