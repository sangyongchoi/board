package com.board.dev.domain.user.service

import com.board.dev.common.exception.BadRequestException
import com.board.dev.common.exception.DuplicatedException
import com.board.dev.domain.user.entity.User
import com.board.dev.domain.user.repository.UserRepository
import org.springframework.security.core.authority.SimpleGrantedAuthority
import org.springframework.security.core.userdetails.UserDetails
import org.springframework.security.core.userdetails.UserDetailsService
import org.springframework.security.crypto.password.PasswordEncoder
import org.springframework.stereotype.Service

@Service
class UserService(
    private val userRepository: UserRepository,
    private val passwordEncoder: PasswordEncoder
): UserDetailsService {

    fun signUp(user: User): User {
        val isExist = userRepository.findById(user.id).isPresent
        if(isExist) {
            throw DuplicatedException("이미 존재하는 회원입니다.")
        }

        user.encryptPassword(passwordEncoder)
        return userRepository.save(user)
    }

    override fun loadUserByUsername(userId: String): UserDetails {
        val user = userRepository.findById(userId).orElseThrow { throw BadRequestException("유저정보가 잘못되었습니다.") }

        return org.springframework.security.core.userdetails.User(
            user.id,
            user.password,
            listOf(SimpleGrantedAuthority(user.role.name))
        )
    }
}