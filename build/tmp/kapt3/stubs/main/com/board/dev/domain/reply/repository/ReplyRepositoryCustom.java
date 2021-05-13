package com.board.dev.domain.reply.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH&\u00a8\u0006\t"}, d2 = {"Lcom/board/dev/domain/reply/repository/ReplyRepositoryCustom;", "", "findByPostId", "Lorg/springframework/data/domain/Page;", "Lcom/board/dev/domain/reply/dto/ReplyResponseDto$ReplyInfo;", "postId", "", "pageable", "Lorg/springframework/data/domain/Pageable;", "dev"})
public abstract interface ReplyRepositoryCustom {
    
    @org.jetbrains.annotations.NotNull()
    public abstract org.springframework.data.domain.Page<com.board.dev.domain.reply.dto.ReplyResponseDto.ReplyInfo> findByPostId(long postId, @org.jetbrains.annotations.NotNull()
    org.springframework.data.domain.Pageable pageable);
}