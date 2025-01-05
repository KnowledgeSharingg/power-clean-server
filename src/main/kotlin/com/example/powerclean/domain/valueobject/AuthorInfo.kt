package com.example.powerclean.domain.valueobject

import jakarta.persistence.Column
import jakarta.persistence.Embeddable

@Embeddable
class AuthorInfo(
    @Column(name = "author_name", nullable = false)
    val name: String,
    @Column(name = "author_date_of_birth", nullable = false)
    val dateOfBirth: String,
    @Column(name = "author_phone_number", nullable = false)
    val phoneNumber: String,
    @Column(name = "author_gender", nullable = false)
    val gender: String,
    @Column(name = "author_history", nullable = false)
    val history: String,
)
