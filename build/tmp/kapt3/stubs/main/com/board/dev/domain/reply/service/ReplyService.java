package com.board.dev.domain.reply.service;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u001e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0010\u0010\u0012\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0013H\u0016J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\t\u001a\u00020\u0016H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lcom/board/dev/domain/reply/service/ReplyService;", "", "replyRepository", "Lcom/board/dev/domain/reply/repository/ReplyRepository;", "postRepository", "Lcom/board/dev/domain/post/repository/PostRepository;", "(Lcom/board/dev/domain/reply/repository/ReplyRepository;Lcom/board/dev/domain/post/repository/PostRepository;)V", "delete", "", "request", "Lcom/board/dev/domain/reply/dto/ReplyRequestDto$DeleteRequest;", "findRepliesByPostId", "Lorg/springframework/data/domain/Page;", "Lcom/board/dev/domain/reply/dto/ReplyResponseDto$ReplyInfo;", "postId", "", "pageable", "Lorg/springframework/data/domain/Pageable;", "modify", "Lcom/board/dev/domain/reply/dto/ReplyRequestDto$ModifyRequest;", "write", "Lcom/board/dev/domain/reply/entity/Reply;", "Lcom/board/dev/domain/reply/dto/ReplyRequestDto$CreateRequest;", "dev"})
@org.springframework.stereotype.Service()
public class ReplyService {
    private final com.board.dev.domain.reply.repository.ReplyRepository replyRepository = null;
    private final com.board.dev.domain.post.repository.PostRepository postRepository = null;
    
    @org.jetbrains.annotations.NotNull()
    public com.board.dev.domain.reply.entity.Reply write(@org.jetbrains.annotations.NotNull()
    com.board.dev.domain.reply.dto.ReplyRequestDto.CreateRequest request) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public org.springframework.data.domain.Page<com.board.dev.domain.reply.dto.ReplyResponseDto.ReplyInfo> findRepliesByPostId(long postId, @org.jetbrains.annotations.NotNull()
    org.springframework.data.domain.Pageable pageable) {
        return null;
    }
    
    public void modify(@org.jetbrains.annotations.NotNull()
    com.board.dev.domain.reply.dto.ReplyRequestDto.ModifyRequest request) {
    }
    
    public void delete(@org.jetbrains.annotations.NotNull()
    com.board.dev.domain.reply.dto.ReplyRequestDto.DeleteRequest request) {
    }
    
    public ReplyService(@org.jetbrains.annotations.NotNull()
    com.board.dev.domain.reply.repository.ReplyRepository replyRepository, @org.jetbrains.annotations.NotNull()
    com.board.dev.domain.post.repository.PostRepository postRepository) {
        super();
    }
}