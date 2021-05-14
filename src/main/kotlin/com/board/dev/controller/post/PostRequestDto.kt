package com.board.dev.controller.post

import com.board.dev.domain.post.entity.Post
import java.time.LocalDateTime

object PostRequestDto {

    data class PostInfo(
        val userId: String,
        val homeSize: Int,
        val startDate: LocalDateTime,
        val endDate: LocalDateTime,
        val requirements: String? = ""
    ) {

        fun convertToPost(): Post {
            return Post(null, userId, Post.Companion.Contents(homeSize, startDate, endDate, requirements))
        }
    }

    data class ModifyRequest(
        val postId: Long,
        val homeSize: Int,
        val startDate: LocalDateTime,
        val endDate: LocalDateTime,
        val requirements: String? = ""
    )

    data class DeleteRequest(
        val postId: Long
    )
}