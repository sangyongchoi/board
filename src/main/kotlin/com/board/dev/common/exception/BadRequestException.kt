package com.board.dev.common.exception

class BadRequestException(
    override val message: String
): BaseException(message, ExceptionCode.BAD_REQUEST) {
}