package com.board.dev.security

import io.jsonwebtoken.Claims
import io.jsonwebtoken.Jwts
import io.jsonwebtoken.SignatureAlgorithm
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
        val payloads: Claims = Jwts.claims()
        val now = LocalDateTime.now().atZone(ZoneId.of(TIME_ZONE_KST))
        val expiredDate = Date.from(now.plusMinutes(60L).toInstant())

        payloads["userId"] = userId

        return Jwts.builder()
            .setClaims(payloads)
            .setSubject(userId)
            .setExpiration(expiredDate)
            .signWith(SignatureAlgorithm.HS256, secretKey.toByteArray())
            .compact()
    }
}