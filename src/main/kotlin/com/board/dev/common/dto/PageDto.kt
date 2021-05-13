package com.board.dev.common.dto

import org.springframework.data.domain.Page

data class PageResponse<T>(
    val contents: List<T>,
    val isLast: Boolean
) {

    constructor(pageInfo: Page<T>): this(pageInfo.content, pageInfo.isLast)
}