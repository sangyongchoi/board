package com.board.dev.domain.post.repository

import com.board.dev.domain.post.entity.Post
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.data.jpa.repository.JpaRepository

interface PostRepository: JpaRepository<Post, Long> {
    fun findByWriterIdOrderByIdDesc(writerId: String, pageable: Pageable): Page<Post>
}