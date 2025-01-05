package com.example.powerclean.domain.model

import com.example.powerclean.domain.valueobject.PersonalInfo
import jakarta.persistence.CascadeType
import jakarta.persistence.Column
import jakarta.persistence.Embedded
import jakarta.persistence.Entity
import jakarta.persistence.FetchType
import jakarta.persistence.OneToOne
import jakarta.persistence.Table

@Entity
@Table(name = "account")
class Account(
    @Column(name = "nickname", nullable = false)
    var nickname: String,
    @Embedded
    var personalInfo: PersonalInfo,
    @OneToOne(
        mappedBy = "account",
        cascade = [CascadeType.ALL],
        fetch = FetchType.LAZY,
        optional = true,
    )
    var oauthProfile: OauthProfile? = null,
) : BaseEntity()
