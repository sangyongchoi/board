package com.board.dev.controller.reply;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\b\u001a\u00020\tH\u0017J\"\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\b\b\u0001\u0010\r\u001a\u00020\u000e2\b\b\u0001\u0010\u000f\u001a\u00020\u0010H\u0017J\u0018\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\b\u001a\u00020\u0012H\u0017J\u0012\u0010\u0013\u001a\u00020\u000e2\b\b\u0001\u0010\b\u001a\u00020\u0014H\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcom/board/dev/controller/reply/ReplyController;", "", "replyService", "Lcom/board/dev/domain/reply/service/ReplyService;", "(Lcom/board/dev/domain/reply/service/ReplyService;)V", "delete", "Lorg/springframework/http/ResponseEntity;", "", "request", "Lcom/board/dev/domain/reply/dto/ReplyRequestDto$DeleteRequest;", "getReplies", "Lcom/board/dev/common/dto/PageResponse;", "Lcom/board/dev/domain/reply/dto/ReplyResponseDto$ReplyInfo;", "postId", "", "page", "", "modify", "Lcom/board/dev/domain/reply/dto/ReplyRequestDto$ModifyRequest;", "write", "Lcom/board/dev/domain/reply/dto/ReplyRequestDto$CreateRequest;", "dev"})
@org.springframework.web.bind.annotation.RestController()
public class ReplyController {
    private final com.board.dev.domain.reply.service.ReplyService replyService = null;
    
    @org.springframework.web.bind.annotation.PostMapping(value = {"/reply"})
    public long write(@org.jetbrains.annotations.NotNull()
    @org.springframework.web.bind.annotation.RequestBody()
    com.board.dev.domain.reply.dto.ReplyRequestDto.CreateRequest request) {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.web.bind.annotation.GetMapping(value = {"/replies/{postId}"})
    public com.board.dev.common.dto.PageResponse<com.board.dev.domain.reply.dto.ReplyResponseDto.ReplyInfo> getReplies(@org.springframework.web.bind.annotation.PathVariable(value = "postId")
    long postId, @org.springframework.web.bind.annotation.RequestParam()
    int page) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.web.bind.annotation.PutMapping(value = {"/reply"})
    public org.springframework.http.ResponseEntity<java.lang.String> modify(@org.jetbrains.annotations.NotNull()
    @org.springframework.web.bind.annotation.RequestBody()
    com.board.dev.domain.reply.dto.ReplyRequestDto.ModifyRequest request) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.web.bind.annotation.DeleteMapping(value = {"/reply"})
    public org.springframework.http.ResponseEntity<java.lang.String> delete(@org.jetbrains.annotations.NotNull()
    @org.springframework.web.bind.annotation.RequestBody()
    com.board.dev.domain.reply.dto.ReplyRequestDto.DeleteRequest request) {
        return null;
    }
    
    public ReplyController(@org.jetbrains.annotations.NotNull()
    com.board.dev.domain.reply.service.ReplyService replyService) {
        super();
    }
}