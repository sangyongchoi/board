package com.board.dev.domain.user.service

import com.board.dev.common.exception.DuplicatedException
import com.board.dev.domain.user.entity.User
import com.board.dev.domain.user.repository.UserRepository
import org.springframework.security.crypto.password.PasswordEncoder
import org.springframework.stereotype.Service

@Service
class UserService(
    private val userRepository: UserRepository,
    private val passwordEncoder: PasswordEncoder
) {

    fun signUp(user: User): User {
        val isExist = userRepository.findById(user.id).isPresent
        if(isExist) {
            throw DuplicatedException("이미 존재하는 회원입니다.")
        }

        user.encryptPassword(passwordEncoder)
        return userRepository.save(user)
    }
}