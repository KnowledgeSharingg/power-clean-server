package com.example.powerclean.domain.repository.orm.jpa

import com.example.powerclean.domain.model.OauthProfile
import com.example.powerclean.domain.repository.OauthProfileRepository
import org.springframework.data.jpa.repository.JpaRepository
import java.util.UUID

public interface JpaOauthProfileRepository : OauthProfileRepository, JpaRepository<OauthProfile, UUID>
