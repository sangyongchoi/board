package com.board.dev.common.exception

import kotlin.RuntimeException

abstract class BaseException(
    override val message: String?,
    val exceptionCode: ExceptionCode
): RuntimeException(message) {
}