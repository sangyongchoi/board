package com.board.dev.common.exception

import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestControllerAdvice

@RestControllerAdvice
class GlobalExceptionHandler {

    @ExceptionHandler(BadRequestException::class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    fun badRequestExceptionHandle(exception: BadRequestException): String {
        return exception.message
    }

    @ExceptionHandler(DuplicatedException::class)
    @ResponseStatus(HttpStatus.CONFLICT)
    fun conflictExceptionHandle(exception: DuplicatedException): String {
        return exception.message
    }

    @ExceptionHandler(ForbiddenException::class)
    @ResponseStatus(HttpStatus.FORBIDDEN)
    fun forbiddenExceptionHandle(exception: ForbiddenException): String {
        return exception.message
    }
}