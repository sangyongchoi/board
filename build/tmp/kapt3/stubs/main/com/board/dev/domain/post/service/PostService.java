package com.board.dev.domain.post.service;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\b\u0017\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u001e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0012H\u0016J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u000bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lcom/board/dev/domain/post/service/PostService;", "", "postRepository", "Lcom/board/dev/domain/post/repository/PostRepository;", "(Lcom/board/dev/domain/post/repository/PostRepository;)V", "delete", "", "request", "Lcom/board/dev/controller/post/PostRequestDto$DeleteRequest;", "findMyWrittenList", "Lorg/springframework/data/domain/Page;", "Lcom/board/dev/domain/post/entity/Post;", "userId", "", "pageable", "Lorg/springframework/data/domain/Pageable;", "findPostList", "modify", "Lcom/board/dev/controller/post/PostRequestDto$ModifyRequest;", "write", "", "post", "dev"})
@org.springframework.stereotype.Service()
public class PostService {
    private final com.board.dev.domain.post.repository.PostRepository postRepository = null;
    
    public long write(@org.jetbrains.annotations.NotNull()
    com.board.dev.domain.post.entity.Post post) {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public org.springframework.data.domain.Page<com.board.dev.domain.post.entity.Post> findMyWrittenList(@org.jetbrains.annotations.NotNull()
    java.lang.String userId, @org.jetbrains.annotations.NotNull()
    org.springframework.data.domain.Pageable pageable) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public org.springframework.data.domain.Page<com.board.dev.domain.post.entity.Post> findPostList(@org.jetbrains.annotations.NotNull()
    org.springframework.data.domain.Pageable pageable) {
        return null;
    }
    
    public void modify(@org.jetbrains.annotations.NotNull()
    com.board.dev.controller.post.PostRequestDto.ModifyRequest request) {
    }
    
    public void delete(@org.jetbrains.annotations.NotNull()
    com.board.dev.controller.post.PostRequestDto.DeleteRequest request) {
    }
    
    public PostService(@org.jetbrains.annotations.NotNull()
    com.board.dev.domain.post.repository.PostRepository postRepository) {
        super();
    }
}