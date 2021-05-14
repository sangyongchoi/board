package com.board.dev.common.config

import com.board.dev.common.config.argument.UserIdArgumentResolver
import org.springframework.context.annotation.Configuration
import org.springframework.data.web.PageableHandlerMethodArgumentResolver
import org.springframework.web.method.support.HandlerMethodArgumentResolver
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer

@Configuration
class WebMvcConfig(
    private val userIdArgumentResolver: UserIdArgumentResolver
): WebMvcConfigurer {

    override fun addArgumentResolvers(resolvers: MutableList<HandlerMethodArgumentResolver>) {
        resolvers.add(userIdArgumentResolver)
        resolvers.add(PageableHandlerMethodArgumentResolver())
    }
}