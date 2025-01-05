package com.example.power_clean.presentation.rest


import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.security.core.annotation.AuthenticationPrincipal
import org.springframework.security.oauth2.core.user.OAuth2User
import com.example.power_clean.application.service.AuthService

@RestController
class AuthController(private val authService: AuthService) {
    
    @GetMapping("oauth2/login")
    fun oauth2Login(@AuthenticationPrincipal principal: OAuth2User): String = authService.oauth2Login(principal)
}