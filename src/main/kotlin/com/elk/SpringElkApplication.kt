package com.elk

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringElkApplication

fun main(args: Array<String>) {
    runApplication<SpringElkApplication>(*args)
}
