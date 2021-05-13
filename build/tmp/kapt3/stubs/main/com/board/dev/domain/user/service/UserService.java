package com.board.dev.domain.user.service;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0017\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/board/dev/domain/user/service/UserService;", "", "userRepository", "Lcom/board/dev/domain/user/repository/UserRepository;", "passwordEncoder", "Lorg/springframework/security/crypto/password/PasswordEncoder;", "(Lcom/board/dev/domain/user/repository/UserRepository;Lorg/springframework/security/crypto/password/PasswordEncoder;)V", "signUp", "Lcom/board/dev/domain/user/entity/User;", "user", "dev"})
@org.springframework.stereotype.Service()
public class UserService {
    private final com.board.dev.domain.user.repository.UserRepository userRepository = null;
    private final org.springframework.security.crypto.password.PasswordEncoder passwordEncoder = null;
    
    @org.jetbrains.annotations.NotNull()
    public com.board.dev.domain.user.entity.User signUp(@org.jetbrains.annotations.NotNull()
    com.board.dev.domain.user.entity.User user) {
        return null;
    }
    
    public UserService(@org.jetbrains.annotations.NotNull()
    com.board.dev.domain.user.repository.UserRepository userRepository, @org.jetbrains.annotations.NotNull()
    org.springframework.security.crypto.password.PasswordEncoder passwordEncoder) {
        super();
    }
}