package com.board.dev.common.exception

class DuplicatedException(
    override val message: String
): BaseException(message, ExceptionCode.DUPLICATED_ERROR) {
}