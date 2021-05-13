package com.board.dev.domain.post.entity

import com.board.dev.common.exception.ForbiddenException
import org.springframework.data.annotation.CreatedDate
import java.time.LocalDateTime
import javax.persistence.*

@Entity(name = "posts")
class Post(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,
    val writerId: String,
    @Embedded
    var contents: Contents,
) {
    @CreatedDate
    val createdAt: LocalDateTime? = LocalDateTime.now()

    fun modify(userId: String, contents: Contents) {
        if(!isWriter(userId)) {
            throw ForbiddenException("작성자만 수정가능합니다.")
        }

        this.contents = contents
    }

    fun isWriter(userId: String): Boolean {
        return writerId == userId
    }

    companion object {
        @Embeddable
        data class Contents(
            @Column(name = "home_size")
            val homeSize: Int,
            @Column(name = "start_date")
            val startDate: LocalDateTime,
            @Column(name = "end_date")
            val endDate: LocalDateTime,
            @Column(name = "requirements")
            val requirements: String? = ""
        )
    }
}