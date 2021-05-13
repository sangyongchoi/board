package com.board.dev.domain.reply.entity

import com.board.dev.common.exception.ForbiddenException
import com.board.dev.domain.post.entity.Post
import org.springframework.data.annotation.CreatedDate
import org.springframework.data.annotation.LastModifiedDate
import java.time.LocalDateTime
import javax.persistence.*

@Entity(name = "replies")
class Reply(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,
    @ManyToOne(fetch = FetchType.LAZY)
    val post: Post,
    val writerId: String,
    private var contents: String,
) {

    fun changeContents(userId: String, contents: String) {
        if(!isWriter(userId)) {
            throw ForbiddenException("작성자만 수정가능합니다.")
        }

        this.contents = contents
    }

    fun isWriter(userId: String): Boolean {
        return writerId == userId
    }

    @CreatedDate
    val createdAt: LocalDateTime? = LocalDateTime.now()
    @LastModifiedDate
    val modifiedAt: LocalDateTime? = LocalDateTime.now()
}