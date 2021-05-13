package com.board.dev.security

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class JwtProviderTest {

    val jwtProvider = JwtProvider()

    @Test
    fun createTest() {
        val token = jwtProvider.createToken("csytest")
        println(token)
        assertNotNull(token)
    }
}