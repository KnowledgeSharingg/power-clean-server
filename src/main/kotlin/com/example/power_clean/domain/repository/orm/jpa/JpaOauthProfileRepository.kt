package com.example.power_clean.domain.repository.orm.jpa

import org.springframework.data.jpa.repository.JpaRepository
import com.example.power_clean.domain.repository.OauthProfileRepository
import com.example.power_clean.domain.model.OauthProfile
import java.util.UUID

public interface JpaOauthProfileRepository: OauthProfileRepository, JpaRepository<OauthProfile, UUID> {
}