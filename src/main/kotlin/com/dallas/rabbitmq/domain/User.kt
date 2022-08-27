package com.dallas.rabbitmq.domain

import com.fasterxml.jackson.annotation.JsonProperty

data class User(
    @JsonProperty("name") val name: String
)
