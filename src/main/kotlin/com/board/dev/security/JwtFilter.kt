package com.board.dev.security

import com.board.dev.common.exception.ForbiddenException
import org.springframework.security.core.Authentication
import org.springframework.security.core.context.SecurityContextHolder
import org.springframework.web.filter.OncePerRequestFilter
import javax.servlet.FilterChain
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse

class JwtFilter(
    private val jwtProvider: JwtProvider
): OncePerRequestFilter() {

    private val skipUrlList = listOf("/signup", "/login")

    override fun doFilterInternal(request: HttpServletRequest, response: HttpServletResponse, filterChain: FilterChain) {
        val token: String = resolveToken(request)

        try {
            if (!isTokenValidate(token)) {
                throw ForbiddenException("권한이 없습니다.")
            }

            val auth: Authentication = jwtProvider.getAuthentication(token)
            SecurityContextHolder.getContext().authentication = auth
            filterChain.doFilter(request, response)
        } catch (ex: Exception) {
            SecurityContextHolder.clearContext()
            response.sendError(403, ex.message)
            return
        }
    }

    override fun shouldNotFilter(request: HttpServletRequest): Boolean {
        val path = request.requestURI

        return skipUrlList.contains(path)
    }

    private fun resolveToken(req: HttpServletRequest): String {
        val bearerToken = req.getHeader(JwtProvider.TOKEN_HEADER)
        return if (bearerToken != null && bearerToken.startsWith("Bearer ")) {
            bearerToken.substring(7)
        } else ""
    }

    private fun isTokenValidate(token: String): Boolean {
        if(token.isBlank()) {
            return false
        }

        if(jwtProvider.validateToken(token)) {
            return true
        }
        return false
    }
}