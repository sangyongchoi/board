package com.board.dev.common.exception

class ForbiddenException(
    override val message: String
): BaseException(message, ExceptionCode.FORBIDDEN) {
}