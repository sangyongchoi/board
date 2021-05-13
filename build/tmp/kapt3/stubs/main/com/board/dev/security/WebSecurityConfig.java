package com.board.dev.security;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0014J\b\u0010\u0007\u001a\u00020\bH\u0017\u00a8\u0006\t"}, d2 = {"Lcom/board/dev/security/WebSecurityConfig;", "Lorg/springframework/security/config/annotation/web/configuration/WebSecurityConfigurerAdapter;", "()V", "configure", "", "http", "Lorg/springframework/security/config/annotation/web/builders/HttpSecurity;", "passwordEncoder", "Lorg/springframework/security/crypto/password/PasswordEncoder;", "dev"})
@org.springframework.security.config.annotation.web.configuration.EnableWebSecurity()
public class WebSecurityConfig extends org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter {
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.context.annotation.Bean()
    public org.springframework.security.crypto.password.PasswordEncoder passwordEncoder() {
        return null;
    }
    
    @java.lang.Override()
    protected void configure(@org.jetbrains.annotations.NotNull()
    org.springframework.security.config.annotation.web.builders.HttpSecurity http) {
    }
    
    public WebSecurityConfig() {
        super();
    }
}