package com.example.power_clean.config

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity
import org.springframework.security.web.SecurityFilterChain
import org.springframework.security.web.authentication.HttpStatusEntryPoint
import org.springframework.http.HttpStatus

@Configuration
@EnableWebSecurity
class SecurityConfig {

    @Bean
    fun securityFilterChain(http: HttpSecurity): SecurityFilterChain {
        http
            .csrf { it.disable() } // CSRF 보호 비활성화
            .authorizeHttpRequests {
                it.requestMatchers("/", "/error", "/webjars/**").permitAll()
                it.anyRequest().authenticated()
            }
            .exceptionHandling { exception ->
                exception.authenticationEntryPoint(HttpStatusEntryPoint(HttpStatus.UNAUTHORIZED))
            }
            .formLogin { it.disable() } // 기본 로그인 페이지 비활성화
            .oauth2Login { oauth2 ->
                oauth2
                    // .loginPage("/custom-login") // 커스텀 로그인 페이지 설정 (옵션)
                    // .userInfoEndpoint { userInfo ->
                    //     userInfo.userService(customOAuth2UserService()) // 사용자 정보 처리
                    // }
            }

        return http.build()
    }
}
