

import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.security.core.annotation.AuthenticationPrincipal
import org.springframework.security.oauth2.core.user.OAuth2User

@RestController("account")
class AccountController {
    @GetMapping("")
    fun getAccount(@AuthenticationPrincipal principal: OAuth2User): Map<String, Any?> {
        return mapOf("name" to principal.getAttribute<String>("name"))
    }
}