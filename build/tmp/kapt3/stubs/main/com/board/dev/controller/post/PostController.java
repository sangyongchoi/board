package com.board.dev.controller.post;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\b\u001a\u00020\tH\u0017J\"\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\b\b\u0001\u0010\r\u001a\u00020\u00072\b\b\u0001\u0010\u000e\u001a\u00020\u000fH\u0017J\u0018\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\b\b\u0001\u0010\u000e\u001a\u00020\u000fH\u0017J\u0018\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\b\u001a\u00020\u0012H\u0017J\u0012\u0010\u0013\u001a\u00020\u00142\b\b\u0001\u0010\u0015\u001a\u00020\u0016H\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lcom/board/dev/controller/post/PostController;", "", "postService", "Lcom/board/dev/domain/post/service/PostService;", "(Lcom/board/dev/domain/post/service/PostService;)V", "delete", "Lorg/springframework/http/ResponseEntity;", "", "request", "Lcom/board/dev/controller/post/PostRequestDto$DeleteRequest;", "getMyWrittenList", "Lcom/board/dev/common/dto/PageResponse;", "Lcom/board/dev/domain/post/entity/Post;", "userId", "page", "", "getPostList", "modify", "Lcom/board/dev/controller/post/PostRequestDto$ModifyRequest;", "write", "Lcom/board/dev/controller/post/PostResponseDto$CreatedPost;", "postInfo", "Lcom/board/dev/controller/post/PostRequestDto$PostInfo;", "dev"})
@org.springframework.web.bind.annotation.RestController()
public class PostController {
    private final com.board.dev.domain.post.service.PostService postService = null;
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.web.bind.annotation.PostMapping(value = {"/post"})
    @org.springframework.web.bind.annotation.ResponseStatus(value = org.springframework.http.HttpStatus.CREATED)
    public com.board.dev.controller.post.PostResponseDto.CreatedPost write(@org.jetbrains.annotations.NotNull()
    @org.springframework.web.bind.annotation.RequestBody()
    com.board.dev.controller.post.PostRequestDto.PostInfo postInfo) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.web.bind.annotation.GetMapping(value = {"/posts/my/{page}"})
    public com.board.dev.common.dto.PageResponse<com.board.dev.domain.post.entity.Post> getMyWrittenList(@org.jetbrains.annotations.NotNull()
    @org.springframework.web.bind.annotation.RequestParam()
    java.lang.String userId, @org.springframework.web.bind.annotation.PathVariable(value = "page")
    int page) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.web.bind.annotation.GetMapping(value = {"/posts/{page}"})
    public com.board.dev.common.dto.PageResponse<com.board.dev.domain.post.entity.Post> getPostList(@org.springframework.web.bind.annotation.PathVariable(value = "page")
    int page) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.web.bind.annotation.PutMapping(value = {"/post"})
    public org.springframework.http.ResponseEntity<java.lang.String> modify(@org.jetbrains.annotations.NotNull()
    @org.springframework.web.bind.annotation.RequestBody()
    com.board.dev.controller.post.PostRequestDto.ModifyRequest request) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.web.bind.annotation.DeleteMapping(value = {"/post"})
    public org.springframework.http.ResponseEntity<java.lang.String> delete(@org.jetbrains.annotations.NotNull()
    @org.springframework.web.bind.annotation.RequestBody()
    com.board.dev.controller.post.PostRequestDto.DeleteRequest request) {
        return null;
    }
    
    public PostController(@org.jetbrains.annotations.NotNull()
    com.board.dev.domain.post.service.PostService postService) {
        super();
    }
}