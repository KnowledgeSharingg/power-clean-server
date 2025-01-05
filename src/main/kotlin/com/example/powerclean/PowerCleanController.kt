package com.example.powerclean

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class PowerCleanController {
    @GetMapping("/health-check")
    fun healthCheck(): String {
        return "I'm healthy!"
    }
}
