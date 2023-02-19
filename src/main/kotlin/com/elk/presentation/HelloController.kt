package com.elk.presentation

import com.elk.Logger
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloController {

    companion object {
        val logger = Logger<HelloController>()
    }

    @GetMapping("/hello")
    suspend fun hello(): ResponseEntity<String> {
        logger.info("hello world!!")
        return ResponseEntity.ok("hello world")
    }
}