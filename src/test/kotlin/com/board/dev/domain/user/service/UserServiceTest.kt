package com.board.dev.domain.user.service

import com.board.dev.common.exception.DuplicatedException
import com.board.dev.domain.user.entity.User
import com.board.dev.domain.user.repository.UserRepository
import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertTrue
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.security.crypto.password.PasswordEncoder

@SpringBootTest
internal class UserServiceTest {

    @Autowired
    lateinit var userRepository: UserRepository

    @Autowired
    lateinit var userService: UserService

    @Autowired
    lateinit var passwordEncoder: PasswordEncoder

    val userId = "csytest"

    @BeforeEach
    fun setUp() {
        val user = User(userId, "test", "test", User.Role.ROLE_MEMBER)
        userRepository.save(user)
    }

    @Test
    @DisplayName("회원가입 실패 - 이미 존재할 때")
    fun sign_up_fail_when_exists() {
        assertThrows<DuplicatedException>{
            val existsUser = User(userId, "test", "test", User.Role.ROLE_MEMBER)
            userService.signUp(existsUser)
        }
    }

    @Test
    @DisplayName("유저 회원가입 성공")
    fun member_sign_up() {
        val password = "test"
        val user = User("csytest2", password, "test", User.Role.ROLE_MEMBER)
        val savedUser = userService.signUp(user)

        assertEquals("csytest2", savedUser.id)
        assertTrue(passwordEncoder.matches(password, savedUser.password))
    }

    @Test
    @DisplayName("전문가 회원가입 성공")
    fun expert_sign_up() {
        val password = "test"
        val user = User("csytest3", password, "test", User.Role.ROLE_EXPERT)
        val savedExpert = userService.signUp(user)

        assertEquals("csytest3", savedExpert.id)
        assertTrue(passwordEncoder.matches(password, savedExpert.password))
    }
}