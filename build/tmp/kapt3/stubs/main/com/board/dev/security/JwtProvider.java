package com.board.dev.security;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0017\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\u0004H\u0016R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\n"}, d2 = {"Lcom/board/dev/security/JwtProvider;", "", "()V", "secretKey", "", "getSecretKey", "()Ljava/lang/String;", "createToken", "userId", "Companion", "dev"})
@org.springframework.stereotype.Component()
public class JwtProvider {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String secretKey = "12321dsfkjsdfkl123lkjmn123";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TOKEN_HEADER = "Authorization";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TIME_ZONE_KST = "Asia/Seoul";
    @org.jetbrains.annotations.NotNull()
    public static final com.board.dev.security.JwtProvider.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public java.lang.String getSecretKey() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public java.lang.String createToken(@org.jetbrains.annotations.NotNull()
    java.lang.String userId) {
        return null;
    }
    
    public JwtProvider() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/board/dev/security/JwtProvider$Companion;", "", "()V", "TIME_ZONE_KST", "", "TOKEN_HEADER", "dev"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}