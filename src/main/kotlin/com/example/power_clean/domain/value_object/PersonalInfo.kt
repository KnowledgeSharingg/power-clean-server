package com.example.power_clean.domain.value_object

import jakarta.persistence.Embeddable
import jakarta.persistence.Column

@Embeddable
class PersonalInfo(
    @Column(name = "name", nullable = false)
    var name: String,

    @Column(name = "date_of_birth", nullable = true)
    var dateOfBirth: String? = null,

    @Column(name = "phone_number", nullable = true)
    var phoneNumber: String? = null,

    @Column(name = "gender", nullable = true)
    var gender: String? = null
){}