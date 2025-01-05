package com.example.power_clean.domain.model

import jakarta.persistence.Entity
import jakarta.persistence.Table
import jakarta.persistence.Column
import jakarta.persistence.Embedded
import com.example.power_clean.domain.model.OauthProfile
import com.example.power_clean.domain.value_object.PersonalInfo

@Entity
@Table(name = "account")
class Account(
    @Column(name="nickname", nullable = false)
    var nickname: String,

    @Embedded
    var personalInfo: PersonalInfo

    @OneToOne(mappedBy = "account", cascade = [CascadeType.ALL], fetch = FetchType.LAZY, optional = true)
    var oauthProfile: OauthProfile? = null

): BaseEntity()