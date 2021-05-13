package com.board.dev.common.exception;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0017\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\f"}, d2 = {"Lcom/board/dev/common/exception/BaseException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "message", "", "exceptionCode", "Lcom/board/dev/common/exception/ExceptionCode;", "(Ljava/lang/String;Lcom/board/dev/common/exception/ExceptionCode;)V", "getExceptionCode", "()Lcom/board/dev/common/exception/ExceptionCode;", "getMessage", "()Ljava/lang/String;", "dev"})
public abstract class BaseException extends java.lang.RuntimeException {
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String message = null;
    @org.jetbrains.annotations.NotNull()
    private final com.board.dev.common.exception.ExceptionCode exceptionCode = null;
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.String getMessage() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.board.dev.common.exception.ExceptionCode getExceptionCode() {
        return null;
    }
    
    public BaseException(@org.jetbrains.annotations.Nullable()
    java.lang.String message, @org.jetbrains.annotations.NotNull()
    com.board.dev.common.exception.ExceptionCode exceptionCode) {
        super();
    }
}