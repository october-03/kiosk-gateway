package com.october03.cafe.kiosk.gateway

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.gateway.route.RouteLocator
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder
import org.springframework.cloud.gateway.route.builder.routes
import org.springframework.context.annotation.Bean

@SpringBootApplication
class KioskGatewayApplication

fun main(args: Array<String>) {
  runApplication<KioskGatewayApplication>(*args)
}
