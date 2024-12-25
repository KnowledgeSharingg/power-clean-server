package com.example.power_clean

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration
import org.springframework.boot.runApplication

// TODO: securityFilterChain에 설정한 login 옵션 비활성화가 적용되지 않아 임시로 해당 클래스 제외 처리함.
@SpringBootApplication(exclude = [SecurityAutoConfiguration::class])
class PowerCleanApplication

fun main(args: Array<String>) {
	runApplication<PowerCleanApplication>(*args)
}
