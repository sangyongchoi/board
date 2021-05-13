package com.board.dev.controller.page

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping

@Controller
class PageController {

    @GetMapping("/signup")
    fun signUp(): String {
        return "signup"
    }

    @GetMapping("/apply")
    fun apply(): String {
        return "apply"
    }
}