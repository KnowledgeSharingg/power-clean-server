

import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.GetMapping


@RestController
class PowerCleanController {
    @GetMapping("/health-check")
    fun healthCheck(): String {
        return "I'm healthy!"
    }
}