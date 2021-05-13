package com.board.dev.domain.user.entity

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class UserTest {

    @Test
    fun `0 일때 유저`() {
        val type = 0
        val role = User.Role.values()[type]

        assertEquals(User.Role.ROLE_MEMBER, role)
    }

    @Test
    fun `1 일때 전문가`() {
        val type = 1
        val role = User.Role.values()[type]

        assertEquals(User.Role.ROLE_EXPERT, role)
    }
}