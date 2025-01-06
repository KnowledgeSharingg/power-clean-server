package com.example.powerclean.presentation.dto

import java.util.UUID

data class UpdatePostReqDto(
    val id: UUID,
    val title: String,
    val content: String,
)
