package com.board.dev.security

import org.springframework.http.HttpStatus
import org.springframework.security.core.Authentication
import org.springframework.security.core.userdetails.User
import org.springframework.security.web.authentication.AuthenticationSuccessHandler
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse

class LoginSuccessHandler(
    private val jwtProvider: JwtProvider
): AuthenticationSuccessHandler {

    override fun onAuthenticationSuccess(request: HttpServletRequest, response: HttpServletResponse, authentication: Authentication
    ) {
        val userDetails = authentication.principal as User
        val token = jwtProvider.createToken(userDetails.username)

        response.writer.println(token)
        response.status = HttpStatus.OK.value()
    }
}