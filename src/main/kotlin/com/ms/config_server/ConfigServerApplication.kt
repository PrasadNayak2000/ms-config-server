package com.ms.config_server

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.config.server.EnableConfigServer

@SpringBootApplication
class ConfigServerApplication

fun main(args: Array<String>) {
	runApplication<ConfigServerApplication>(*args)
}