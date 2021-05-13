package com.board.dev.domain.user.entity

import org.springframework.security.crypto.password.PasswordEncoder
import javax.persistence.Entity
import javax.persistence.EnumType
import javax.persistence.Enumerated
import javax.persistence.Id

@Entity(name = "users")
class User(
    @Id
    val id: String,
    var password: String,
    val name: String,
    @Enumerated(EnumType.STRING)
    val role: Role
) {

    fun encryptPassword(passwordEncoder: PasswordEncoder) {
        this.password = passwordEncoder.encode(password)
    }

    enum class Role {
        ROLE_MEMBER,
        ROLE_EXPERT
    }
}