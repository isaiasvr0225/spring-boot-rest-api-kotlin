package com.example

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringBootRestApiKotlinApplication

fun main(args: Array<String>) {
    runApplication<SpringBootRestApiKotlinApplication>(*args)
}
