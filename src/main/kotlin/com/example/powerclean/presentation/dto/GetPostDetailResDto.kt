package com.example.powerclean.presentation.dto

import java.util.UUID

data class GetPostDetailResDto(
    val id: UUID,
    val title: String,
    val content: String,
    val likeCount: Int,
    val createdAt: String,
    val updatedAt: String,
    val bookInfo: GetBookDetailResDto,
)
