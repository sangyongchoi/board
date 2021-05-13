package com.board.dev.domain.reply.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\rH\u0002J\u001e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000f2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u001e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00132\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u0007R\u0010\u0010\b\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u0007\u00a8\u0006\u0014"}, d2 = {"Lcom/board/dev/domain/reply/repository/ReplyRepositoryImpl;", "Lcom/board/dev/domain/reply/repository/ReplyRepositoryCustom;", "jpaQueryFactory", "Lcom/querydsl/jpa/impl/JPAQueryFactory;", "(Lcom/querydsl/jpa/impl/JPAQueryFactory;)V", "qPost", "error/NonExistentClass", "Lerror/NonExistentClass;", "qReply", "countQuery", "Lcom/querydsl/jpa/impl/JPAQuery;", "Lcom/board/dev/domain/reply/dto/ReplyResponseDto$ReplyInfo;", "postId", "", "findByPostId", "Lorg/springframework/data/domain/Page;", "pageable", "Lorg/springframework/data/domain/Pageable;", "getReplies", "", "dev"})
public final class ReplyRepositoryImpl implements com.board.dev.domain.reply.repository.ReplyRepositoryCustom {
    private final error.NonExistentClass qReply = null;
    private final error.NonExistentClass qPost = null;
    private final com.querydsl.jpa.impl.JPAQueryFactory jpaQueryFactory = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.springframework.data.domain.Page<com.board.dev.domain.reply.dto.ReplyResponseDto.ReplyInfo> findByPostId(long postId, @org.jetbrains.annotations.NotNull()
    org.springframework.data.domain.Pageable pageable) {
        return null;
    }
    
    private final java.util.List<com.board.dev.domain.reply.dto.ReplyResponseDto.ReplyInfo> getReplies(long postId, org.springframework.data.domain.Pageable pageable) {
        return null;
    }
    
    private final com.querydsl.jpa.impl.JPAQuery<com.board.dev.domain.reply.dto.ReplyResponseDto.ReplyInfo> countQuery(long postId) {
        return null;
    }
    
    public ReplyRepositoryImpl(@org.jetbrains.annotations.NotNull()
    com.querydsl.jpa.impl.JPAQueryFactory jpaQueryFactory) {
        super();
    }
}