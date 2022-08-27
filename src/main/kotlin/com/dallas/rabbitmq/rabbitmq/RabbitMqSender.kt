package com.dallas.rabbitmq.rabbitmq

import com.dallas.rabbitmq.config.RabbitMqProperties
import com.dallas.rabbitmq.domain.User
import org.springframework.amqp.rabbit.core.RabbitTemplate
import org.springframework.stereotype.Service

@Service
class RabbitMqSender(
    private val rabbitTemplate: RabbitTemplate,
    private val rabbitMqProperties: RabbitMqProperties
) {
    fun send(user: User) {
        rabbitTemplate.convertAndSend(rabbitMqProperties.exchange, rabbitMqProperties.routingKey, user)
    }
}
