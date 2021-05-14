package com.board.dev.security

import org.springframework.context.annotation.Bean
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter
import org.springframework.security.config.http.SessionCreationPolicy
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder
import org.springframework.security.crypto.password.PasswordEncoder

@EnableWebSecurity
class WebSecurityConfig(
    private val jwtProvider: JwtProvider
): WebSecurityConfigurerAdapter() {

    @Bean
    fun passwordEncoder(): PasswordEncoder {
        return BCryptPasswordEncoder()
    }

    override fun configure(http: HttpSecurity) {
        // csrf 방지 비활성화
        http.csrf().disable()

        // 세션 생성 안함
        http.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS)

        // 모든 요청 허용
        http
            .authorizeRequests()
                .anyRequest()
                .permitAll()

        // Login 설정
        http
            .formLogin()
                .successHandler(LoginSuccessHandler(jwtProvider))
    }
}