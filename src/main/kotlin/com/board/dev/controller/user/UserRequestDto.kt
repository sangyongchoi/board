package com.board.dev.controller.user

import com.board.dev.domain.user.entity.User

object UserRequestDto {

    data class RegisterUser(
        val id: String,
        val password: String,
        val name: String,
        val type: Int
    ) {

        fun convertToUser(): User {
            val role = User.Role.values()[type]
            return User(id, password, name, role)
        }
    }
}