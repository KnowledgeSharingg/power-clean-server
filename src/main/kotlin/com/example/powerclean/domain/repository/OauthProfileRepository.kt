package com.example.powerclean.domain.repository

import com.example.powerclean.domain.model.OauthProfile

public interface OauthProfileRepository {
    fun save(oauthProfile: OauthProfile): OauthProfile
}
