package com.example.power_clean.application.service

import org.springframework.stereotype.Service
import org.springframework.security.oauth2.core.user.OAuth2User
import com.example.power_clean.domain.repository.AccountRepository
import com.example.power_clean.domain.repository.OauthProfileRepository
import com.example.power_clean.domain.value_object.PersonalInfo
import com.example.power_clean.domain.model.Account
import com.example.power_clean.domain.model.OauthProfile


@Service
class AuthService(
    private val accountRepository: AccountRepository
    private val oauthProfileRepository: OauthProfileRepository
) {
    fun oauth2Login(principal: OAuth2User): String {
        // TODO: jwt 토큰 발급.
        // TODO: 랜덤 닉네임 할당해주기.

        val foundAccount = accountRepository.findByName(principal.getAttribute<String>("name") ?: throw IllegalArgumentException("name"));
        if (foundAccount == null) {
            val savedAccount: Account = accountRepository.save(Account(nickname = "nickname", personalInfo = PersonalInfo(name = principal.getAttribute<String>("name") ?: throw IllegalArgumentException("name"))))
            oauthProfileRepository.save(OauthProfile(accountId = savedAccount.id, email = principal.getAttribute<String>("email") ?: throw IllegalArgumentException("email"), login = principal.getAttribute<String>("login") ?: throw IllegalArgumentException("login"), profileImageUrl = principal.getAttribute<String>("avatar_url") ?: throw IllegalArgumentException("profileImageUrl"), type = "github"))
        }
        return principal.attributes.toString()
    }
}