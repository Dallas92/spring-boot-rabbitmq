package com.dallas.rabbitmq.config

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.stereotype.Component
import kotlin.properties.Delegates.notNull

@Component
@ConfigurationProperties(prefix = "rabbitmq")
class RabbitMqProperties {
    lateinit var host: String
    var port by notNull<Int>()
    lateinit var exchange: String
    lateinit var routingKey: String
    lateinit var queue: String
    lateinit var username: String
    lateinit var password: String
}
