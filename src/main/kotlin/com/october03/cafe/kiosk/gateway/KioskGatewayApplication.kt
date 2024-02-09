package com.october03.cafe.kiosk.gateway

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KioskGatewayApplication

fun main(args: Array<String>) {
  runApplication<KioskGatewayApplication>(*args)
}
