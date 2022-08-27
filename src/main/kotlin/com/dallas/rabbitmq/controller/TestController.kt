package com.dallas.rabbitmq.controller

import com.dallas.rabbitmq.domain.User
import com.dallas.rabbitmq.rabbitmq.RabbitMqSender
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class TestController(
    private val rabbitMqSender: RabbitMqSender
) {

    @PostMapping("/test")
    fun test(@RequestBody user: User): ResponseEntity<Unit> {
        this.rabbitMqSender.send(user)
        return ResponseEntity.noContent().build()
    }
}
