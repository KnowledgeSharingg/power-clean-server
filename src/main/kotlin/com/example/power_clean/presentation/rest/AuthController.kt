

import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.security.core.annotation.AuthenticationPrincipal
import org.springframework.security.oauth2.core.user.OAuth2User

@RestController
class AuthController {
    
    @GetMapping("oauth2/login")
    fun oauth2Login(@AuthenticationPrincipal principal: OAuth2User): Map<String, Any?> {
        // TODO: db 처리 및 jwt 토큰 발급.
        // return mapOf(
        //     "name" to principal.getAttribute<String>("name"),
        //     "login" to principal.getAttribute<String>("login"),
        //     "email" to principal.getAttribute<String>("email"),
        //     "avatar_url" to principal.getAttribute<String>("avatar_url")
        // )
    }
}