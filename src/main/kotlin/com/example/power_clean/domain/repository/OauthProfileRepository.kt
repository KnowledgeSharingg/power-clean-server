package com.example.power_clean.domain.repository

import com.example.power_clean.domain.model.OauthProfile

public interface OauthProfileRepository {
    fun save(oauthProfile: OauthProfile): OauthProfile
}