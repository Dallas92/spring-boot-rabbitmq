package com.dallas.rabbitmq

import org.springframework.amqp.rabbit.annotation.EnableRabbit
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.boot.runApplication

@EnableRabbit
@EnableConfigurationProperties
@SpringBootApplication
class SpringRabbitmqApplication

fun main(args: Array<String>) {
    runApplication<SpringRabbitmqApplication>(*args)
}
