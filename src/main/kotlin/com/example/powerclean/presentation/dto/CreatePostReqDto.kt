package com.example.powerclean.presentation.dto

import java.util.UUID

data class CreatePostReqDto(
    val title: String,
    val content: String,
    val creatorAccountId: UUID,
    val bookInfo: CreateBookReqDto,
)
