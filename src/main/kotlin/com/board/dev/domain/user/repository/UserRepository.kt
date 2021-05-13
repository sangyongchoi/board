package com.board.dev.domain.user.repository

import com.board.dev.domain.user.entity.User
import org.springframework.data.repository.CrudRepository

interface UserRepository: CrudRepository<User, String> {
}