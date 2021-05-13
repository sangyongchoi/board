package com.board.dev.controller.user;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\b\u001a\u00020\tH\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/board/dev/controller/user/UserController;", "", "userService", "Lcom/board/dev/domain/user/service/UserService;", "(Lcom/board/dev/domain/user/service/UserService;)V", "signUp", "Lorg/springframework/http/ResponseEntity;", "", "userInfo", "Lcom/board/dev/controller/user/UserRequestDto$RegisterUser;", "dev"})
@org.springframework.web.bind.annotation.RestController()
public class UserController {
    private final com.board.dev.domain.user.service.UserService userService = null;
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.web.bind.annotation.PostMapping(value = {"/signup"})
    public org.springframework.http.ResponseEntity<java.lang.String> signUp(@org.jetbrains.annotations.NotNull()
    @org.springframework.web.bind.annotation.RequestBody()
    com.board.dev.controller.user.UserRequestDto.RegisterUser userInfo) {
        return null;
    }
    
    public UserController(@org.jetbrains.annotations.NotNull()
    com.board.dev.domain.user.service.UserService userService) {
        super();
    }
}