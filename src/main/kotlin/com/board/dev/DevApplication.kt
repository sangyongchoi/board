package com.board.dev

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class DevApplication

fun main(args: Array<String>) {
    runApplication<DevApplication>(*args)
}
