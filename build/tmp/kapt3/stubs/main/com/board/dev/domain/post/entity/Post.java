package com.board.dev.domain.post.entity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB!\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u000e\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0005J\u0016\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007R\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0018\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015\u00a8\u0006\u001c"}, d2 = {"Lcom/board/dev/domain/post/entity/Post;", "", "id", "", "writerId", "", "contents", "Lcom/board/dev/domain/post/entity/Post$Companion$Contents;", "(Ljava/lang/Long;Ljava/lang/String;Lcom/board/dev/domain/post/entity/Post$Companion$Contents;)V", "getContents", "()Lcom/board/dev/domain/post/entity/Post$Companion$Contents;", "setContents", "(Lcom/board/dev/domain/post/entity/Post$Companion$Contents;)V", "createdAt", "Ljava/time/LocalDateTime;", "getCreatedAt", "()Ljava/time/LocalDateTime;", "getId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getWriterId", "()Ljava/lang/String;", "isWriter", "", "userId", "modify", "", "Companion", "dev"})
@javax.persistence.Entity(name = "posts")
public final class Post {
    @org.jetbrains.annotations.Nullable()
    @org.springframework.data.annotation.CreatedDate()
    private final java.time.LocalDateTime createdAt = null;
    @org.jetbrains.annotations.Nullable()
    @javax.persistence.GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
    @javax.persistence.Id()
    private final java.lang.Long id = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String writerId = null;
    @org.jetbrains.annotations.NotNull()
    @javax.persistence.Embedded()
    private com.board.dev.domain.post.entity.Post.Companion.Contents contents;
    @org.jetbrains.annotations.NotNull()
    public static final com.board.dev.domain.post.entity.Post.Companion Companion = null;
    
    @org.jetbrains.annotations.Nullable()
    public final java.time.LocalDateTime getCreatedAt() {
        return null;
    }
    
    public final void modify(@org.jetbrains.annotations.NotNull()
    java.lang.String userId, @org.jetbrains.annotations.NotNull()
    com.board.dev.domain.post.entity.Post.Companion.Contents contents) {
    }
    
    public final boolean isWriter(@org.jetbrains.annotations.NotNull()
    java.lang.String userId) {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long getId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getWriterId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.board.dev.domain.post.entity.Post.Companion.Contents getContents() {
        return null;
    }
    
    public final void setContents(@org.jetbrains.annotations.NotNull()
    com.board.dev.domain.post.entity.Post.Companion.Contents p0) {
    }
    
    public Post(@org.jetbrains.annotations.Nullable()
    java.lang.Long id, @org.jetbrains.annotations.NotNull()
    java.lang.String writerId, @org.jetbrains.annotations.NotNull()
    com.board.dev.domain.post.entity.Post.Companion.Contents contents) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"}, d2 = {"Lcom/board/dev/domain/post/entity/Post$Companion;", "", "()V", "Contents", "dev"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u00a2\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\u0005H\u00c6\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\bH\u00c6\u0003J3\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bH\u00c6\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0019\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u001a\u001a\u00020\bH\u00d6\u0001R\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b\u00a8\u0006\u001b"}, d2 = {"Lcom/board/dev/domain/post/entity/Post$Companion$Contents;", "", "homeSize", "", "startDate", "Ljava/time/LocalDateTime;", "endDate", "requirements", "", "(ILjava/time/LocalDateTime;Ljava/time/LocalDateTime;Ljava/lang/String;)V", "getEndDate", "()Ljava/time/LocalDateTime;", "getHomeSize", "()I", "getRequirements", "()Ljava/lang/String;", "getStartDate", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "dev"})
        @javax.persistence.Embeddable()
        public static final class Contents {
            @javax.persistence.Column(name = "home_size")
            private final int homeSize = 0;
            @org.jetbrains.annotations.NotNull()
            @javax.persistence.Column(name = "start_date")
            private final java.time.LocalDateTime startDate = null;
            @org.jetbrains.annotations.NotNull()
            @javax.persistence.Column(name = "end_date")
            private final java.time.LocalDateTime endDate = null;
            @org.jetbrains.annotations.Nullable()
            @javax.persistence.Column(name = "requirements")
            private final java.lang.String requirements = null;
            
            public final int getHomeSize() {
                return 0;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.time.LocalDateTime getStartDate() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.time.LocalDateTime getEndDate() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String getRequirements() {
                return null;
            }
            
            public Contents(int homeSize, @org.jetbrains.annotations.NotNull()
            java.time.LocalDateTime startDate, @org.jetbrains.annotations.NotNull()
            java.time.LocalDateTime endDate, @org.jetbrains.annotations.Nullable()
            java.lang.String requirements) {
                super();
            }
            
            public final int component1() {
                return 0;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.time.LocalDateTime component2() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.time.LocalDateTime component3() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String component4() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.board.dev.domain.post.entity.Post.Companion.Contents copy(int homeSize, @org.jetbrains.annotations.NotNull()
            java.time.LocalDateTime startDate, @org.jetbrains.annotations.NotNull()
            java.time.LocalDateTime endDate, @org.jetbrains.annotations.Nullable()
            java.lang.String requirements) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public java.lang.String toString() {
                return null;
            }
            
            @java.lang.Override()
            public int hashCode() {
                return 0;
            }
            
            @java.lang.Override()
            public boolean equals(@org.jetbrains.annotations.Nullable()
            java.lang.Object p0) {
                return false;
            }
        }
    }
}