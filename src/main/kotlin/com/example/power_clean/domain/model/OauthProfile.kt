package com.example.power_clean.domain.model

import jakarta.persistence.Entity
import jakarta.persistence.Table
import jakarta.persistence.Column
import jakarta.persistence.JoinColumn
import jakarta.persistence.FetchType
import jakarta.persistence.OneToOne
import java.util.UUID
import jakarta.persistence.ForeignKey
import jakarta.persistence.ConstraintMode

@Entity
@Table(name="oauth_profile")
class OauthProfile(
    @Column(name="type", nullable = false)
    var type: String,

    @Column(name="email", nullable = false, unique = true)
    var email: String,

    @Column(name="login", nullable = true)
    var login: String,

    @Column(name="profile_image_url", nullable = true)
    var profileImageUrl: String,

    @Column(name="account_id", nullable = false)
    var accountId: UUID,

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "account_id", foreignKey = ForeignKey(ConstraintMode.NO_CONSTRAINT))
    var account: Account? = null

): BaseEntity() 