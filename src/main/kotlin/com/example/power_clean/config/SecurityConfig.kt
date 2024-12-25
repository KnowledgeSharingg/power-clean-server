package com.example.power_clean.config

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity
import org.springframework.security.web.SecurityFilterChain

@Configuration
@EnableWebSecurity
class SecurityConfig {

    @Bean
    fun securityFilterChain(http: HttpSecurity): SecurityFilterChain {
        http
            .csrf { it.disable() } // CSRF 보호 비활성화
            .authorizeHttpRequests {
                it.anyRequest().permitAll() // 모든 요청을 인증 없이 허용
            }
            .formLogin { it.disable() } // 기본 로그인 페이지 비활성화
        return http.build()
    }
}
