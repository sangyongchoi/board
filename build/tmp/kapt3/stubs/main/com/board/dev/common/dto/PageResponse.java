package com.board.dev.common.dto;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0015\b\u0016\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u00a2\u0006\u0002\u0010\u0005B\u001b\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u00c6\u0003J\t\u0010\u000f\u001a\u00020\tH\u00c6\u0003J)\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u00c6\u0001J\u0013\u0010\u0011\u001a\u00020\t2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002H\u00d6\u0003J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001J\t\u0010\u0015\u001a\u00020\u0016H\u00d6\u0001R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\r\u00a8\u0006\u0017"}, d2 = {"Lcom/board/dev/common/dto/PageResponse;", "T", "", "pageInfo", "Lorg/springframework/data/domain/Page;", "(Lorg/springframework/data/domain/Page;)V", "contents", "", "isLast", "", "(Ljava/util/List;Z)V", "getContents", "()Ljava/util/List;", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "dev"})
public final class PageResponse<T extends java.lang.Object> {
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<T> contents = null;
    private final boolean isLast = false;
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<T> getContents() {
        return null;
    }
    
    public final boolean isLast() {
        return false;
    }
    
    public PageResponse(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends T> contents, boolean isLast) {
        super();
    }
    
    public PageResponse(@org.jetbrains.annotations.NotNull()
    org.springframework.data.domain.Page<T> pageInfo) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<T> component1() {
        return null;
    }
    
    public final boolean component2() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.board.dev.common.dto.PageResponse<T> copy(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends T> contents, boolean isLast) {
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