package com.example.powerclean.presentation.dto

import com.example.powerclean.domain.valueobject.AuthorInfo

data class CreateBookReqDto(
    val title: String,
    val content: String,
    val link: String,
    var authorInfo: AuthorInfo,
)
