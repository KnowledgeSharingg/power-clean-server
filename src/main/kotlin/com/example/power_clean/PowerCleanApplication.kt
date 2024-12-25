package com.example.power_clean

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration
import org.springframework.boot.runApplication

@SpringBootApplication()
class PowerCleanApplication

fun main(args: Array<String>) {
	runApplication<PowerCleanApplication>(*args)
}
