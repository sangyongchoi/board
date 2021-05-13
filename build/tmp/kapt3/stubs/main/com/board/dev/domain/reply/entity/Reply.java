package com.board.dev.domain.reply.entity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\tJ\u0016\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007J\u000e\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u0007R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0018\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016\u00a8\u0006\u001c"}, d2 = {"Lcom/board/dev/domain/reply/entity/Reply;", "", "id", "", "post", "Lcom/board/dev/domain/post/entity/Post;", "writerId", "", "contents", "(Ljava/lang/Long;Lcom/board/dev/domain/post/entity/Post;Ljava/lang/String;Ljava/lang/String;)V", "createdAt", "Ljava/time/LocalDateTime;", "getCreatedAt", "()Ljava/time/LocalDateTime;", "getId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "modifiedAt", "getModifiedAt", "getPost", "()Lcom/board/dev/domain/post/entity/Post;", "getWriterId", "()Ljava/lang/String;", "changeContents", "", "userId", "isWriter", "", "dev"})
@javax.persistence.Entity(name = "replies")
public final class Reply {
    @org.jetbrains.annotations.Nullable()
    @org.springframework.data.annotation.CreatedDate()
    private final java.time.LocalDateTime createdAt = null;
    @org.jetbrains.annotations.Nullable()
    @org.springframework.data.annotation.LastModifiedDate()
    private final java.time.LocalDateTime modifiedAt = null;
    @org.jetbrains.annotations.Nullable()
    @javax.persistence.GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
    @javax.persistence.Id()
    private final java.lang.Long id = null;
    @org.jetbrains.annotations.NotNull()
    @javax.persistence.ManyToOne(fetch = javax.persistence.FetchType.LAZY)
    private final com.board.dev.domain.post.entity.Post post = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String writerId = null;
    private java.lang.String contents;
    
    public final void changeContents(@org.jetbrains.annotations.NotNull()
    java.lang.String userId, @org.jetbrains.annotations.NotNull()
    java.lang.String contents) {
    }
    
    public final boolean isWriter(@org.jetbrains.annotations.NotNull()
    java.lang.String userId) {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.time.LocalDateTime getCreatedAt() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.time.LocalDateTime getModifiedAt() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long getId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.board.dev.domain.post.entity.Post getPost() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getWriterId() {
        return null;
    }
    
    public Reply(@org.jetbrains.annotations.Nullable()
    java.lang.Long id, @org.jetbrains.annotations.NotNull()
    com.board.dev.domain.post.entity.Post post, @org.jetbrains.annotations.NotNull()
    java.lang.String writerId, @org.jetbrains.annotations.NotNull()
    java.lang.String contents) {
        super();
    }
}