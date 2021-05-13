package com.board.dev.common.exception;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0017\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t\u00a8\u0006\n"}, d2 = {"Lcom/board/dev/common/exception/ExceptionCode;", "", "httpStatus", "", "errorCode", "(Ljava/lang/String;III)V", "INTERNAL_EXCEPTION", "BAD_REQUEST", "FORBIDDEN", "DUPLICATED_ERROR", "dev"})
public enum ExceptionCode {
    /*public static final*/ INTERNAL_EXCEPTION /* = new INTERNAL_EXCEPTION(0, 0) */,
    /*public static final*/ BAD_REQUEST /* = new BAD_REQUEST(0, 0) */,
    /*public static final*/ FORBIDDEN /* = new FORBIDDEN(0, 0) */,
    /*public static final*/ DUPLICATED_ERROR /* = new DUPLICATED_ERROR(0, 0) */;
    
    ExceptionCode(int httpStatus, int errorCode) {
    }
}