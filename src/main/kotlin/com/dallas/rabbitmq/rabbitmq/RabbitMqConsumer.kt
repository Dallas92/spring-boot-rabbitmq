package com.dallas.rabbitmq.rabbitmq

import com.dallas.rabbitmq.domain.User
import org.springframework.amqp.rabbit.annotation.RabbitListener
import org.springframework.stereotype.Component

@Component
class RabbitMqConsumer {

    @RabbitListener(queues = ["\${rabbitmq.queue}"])
    fun receive(user: User) {
        println("user: $user")
    }
}
