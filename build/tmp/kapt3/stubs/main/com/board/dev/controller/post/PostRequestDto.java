package com.board.dev.controller.post;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0006"}, d2 = {"Lcom/board/dev/controller/post/PostRequestDto;", "", "()V", "DeleteRequest", "ModifyRequest", "PostInfo", "dev"})
public final class PostRequestDto {
    @org.jetbrains.annotations.NotNull()
    public static final com.board.dev.controller.post.PostRequestDto INSTANCE = null;
    
    private PostRequestDto() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u0007H\u00c6\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0006\u0010\u0018\u001a\u00020\u0019J=\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001e\u001a\u00020\u0005H\u00d6\u0001J\t\u0010\u001f\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\b\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010\u00a8\u0006 "}, d2 = {"Lcom/board/dev/controller/post/PostRequestDto$PostInfo;", "", "userId", "", "homeSize", "", "startDate", "Ljava/time/LocalDateTime;", "endDate", "requirements", "(Ljava/lang/String;ILjava/time/LocalDateTime;Ljava/time/LocalDateTime;Ljava/lang/String;)V", "getEndDate", "()Ljava/time/LocalDateTime;", "getHomeSize", "()I", "getRequirements", "()Ljava/lang/String;", "getStartDate", "getUserId", "component1", "component2", "component3", "component4", "component5", "convertToPost", "Lcom/board/dev/domain/post/entity/Post;", "copy", "equals", "", "other", "hashCode", "toString", "dev"})
    public static final class PostInfo {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String userId = null;
        private final int homeSize = 0;
        @org.jetbrains.annotations.NotNull()
        private final java.time.LocalDateTime startDate = null;
        @org.jetbrains.annotations.NotNull()
        private final java.time.LocalDateTime endDate = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String requirements = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.board.dev.domain.post.entity.Post convertToPost() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getUserId() {
            return null;
        }
        
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
        
        public PostInfo(@org.jetbrains.annotations.NotNull()
        java.lang.String userId, int homeSize, @org.jetbrains.annotations.NotNull()
        java.time.LocalDateTime startDate, @org.jetbrains.annotations.NotNull()
        java.time.LocalDateTime endDate, @org.jetbrains.annotations.Nullable()
        java.lang.String requirements) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        public final int component2() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.time.LocalDateTime component3() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.time.LocalDateTime component4() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component5() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.board.dev.controller.post.PostRequestDto.PostInfo copy(@org.jetbrains.annotations.NotNull()
        java.lang.String userId, int homeSize, @org.jetbrains.annotations.NotNull()
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
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\fJ\t\u0010\u0017\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0019\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\u001a\u001a\u00020\tH\u00c6\u0003J\t\u0010\u001b\u001a\u00020\tH\u00c6\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003JG\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005H\u00c6\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010!\u001a\u00020\u0007H\u00d6\u0001J\t\u0010\"\u001a\u00020\u0005H\u00d6\u0001R\u0011\u0010\n\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014\u00a8\u0006#"}, d2 = {"Lcom/board/dev/controller/post/PostRequestDto$ModifyRequest;", "", "postId", "", "userId", "", "homeSize", "", "startDate", "Ljava/time/LocalDateTime;", "endDate", "requirements", "(JLjava/lang/String;ILjava/time/LocalDateTime;Ljava/time/LocalDateTime;Ljava/lang/String;)V", "getEndDate", "()Ljava/time/LocalDateTime;", "getHomeSize", "()I", "getPostId", "()J", "getRequirements", "()Ljava/lang/String;", "getStartDate", "getUserId", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "dev"})
    public static final class ModifyRequest {
        private final long postId = 0L;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String userId = null;
        private final int homeSize = 0;
        @org.jetbrains.annotations.NotNull()
        private final java.time.LocalDateTime startDate = null;
        @org.jetbrains.annotations.NotNull()
        private final java.time.LocalDateTime endDate = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String requirements = null;
        
        public final long getPostId() {
            return 0L;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getUserId() {
            return null;
        }
        
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
        
        public ModifyRequest(long postId, @org.jetbrains.annotations.NotNull()
        java.lang.String userId, int homeSize, @org.jetbrains.annotations.NotNull()
        java.time.LocalDateTime startDate, @org.jetbrains.annotations.NotNull()
        java.time.LocalDateTime endDate, @org.jetbrains.annotations.Nullable()
        java.lang.String requirements) {
            super();
        }
        
        public final long component1() {
            return 0L;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component2() {
            return null;
        }
        
        public final int component3() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.time.LocalDateTime component4() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.time.LocalDateTime component5() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component6() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.board.dev.controller.post.PostRequestDto.ModifyRequest copy(long postId, @org.jetbrains.annotations.NotNull()
        java.lang.String userId, int homeSize, @org.jetbrains.annotations.NotNull()
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
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\f\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001J\t\u0010\u0013\u001a\u00020\u0005H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0014"}, d2 = {"Lcom/board/dev/controller/post/PostRequestDto$DeleteRequest;", "", "postId", "", "userId", "", "(JLjava/lang/String;)V", "getPostId", "()J", "getUserId", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "dev"})
    public static final class DeleteRequest {
        private final long postId = 0L;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String userId = null;
        
        public final long getPostId() {
            return 0L;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getUserId() {
            return null;
        }
        
        public DeleteRequest(long postId, @org.jetbrains.annotations.NotNull()
        java.lang.String userId) {
            super();
        }
        
        public final long component1() {
            return 0L;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.board.dev.controller.post.PostRequestDto.DeleteRequest copy(long postId, @org.jetbrains.annotations.NotNull()
        java.lang.String userId) {
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