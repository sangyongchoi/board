package com.board.dev.security

import io.jsonwebtoken.Jwts
import io.jsonwebtoken.SignatureAlgorithm
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken
import org.springframework.security.core.Authentication
import org.springframework.stereotype.Component
import java.time.LocalDateTime
import java.time.ZoneId
import java.util.*

@Component
class JwtProvider {

    val secretKey = "12321dsfkjsdfkl123lkjmn123"

    companion object {
        const val TOKEN_HEADER  = "Authorization"
        const val TIME_ZONE_KST = "Asia/Seoul"
    }

    fun createToken(userId: String): String? {
        val now = LocalDateTime.now().atZone(ZoneId.of(TIME_ZONE_KST))
        val expiredDate = Date.from(now.plusMinutes(60L).toInstant())

        return Jwts.builder()
            .setSubject(userId)
            .setExpiration(expiredDate)
            .signWith(SignatureAlgorithm.HS256, secretKey.toByteArray())
            .compact()
    }

    fun getAuthentication(token: String): Authentication {
        val userId = getUserId(token)

        return UsernamePasswordAuthenticationToken(null, userId, null)
    }

    private fun getUserId(token: String): String {
        return Jwts
            .parser()
            .setSigningKey(secretKey.toByteArray())
            .parseClaimsJws(token)
            .body
            .subject
    }

    fun validateToken(token: String?): Boolean {
        Jwts.parser()
            .setSigningKey(secretKey.toByteArray())
            .parseClaimsJws(token)

        return  true
    }
}