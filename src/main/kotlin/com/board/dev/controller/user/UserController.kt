package com.board.dev.controller.user

import com.board.dev.domain.user.service.UserService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class UserController(
    private val userService: UserService
) {

    @PostMapping("/signup")
    fun signUp(@RequestBody userInfo: UserRequestDto.RegisterUser): ResponseEntity<String> {
        val registerRequestUser = userInfo.convertToUser()
        userService.signUp(registerRequestUser)

        return ResponseEntity
            .status(HttpStatus.CREATED)
            .body("success")
    }
}