package com.board.dev.common.exception

enum class ExceptionCode(httpStatus: Int, errorCode: Int) {
    INTERNAL_EXCEPTION(500, 500001),
    BAD_REQUEST(400, 400001),
    FORBIDDEN(403, 400002),
    DUPLICATED_ERROR(409, 400003),
}