package com.example.apiserver2

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class TestController {

    @GetMapping("/test")
    fun getTest(): String {
        return "hello world"
    }
}
