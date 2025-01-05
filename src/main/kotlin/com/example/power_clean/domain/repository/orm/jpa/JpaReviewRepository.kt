package com.example.power_clean.domain.repository.orm.jpa

import org.springframework.data.jpa.repository.JpaRepository
import com.example.power_clean.domain.model.Review
import com.example.power_clean.domain.repository.ReviewRepository
import java.util.UUID

public interface JpaReviewRepository :JpaRepository<Review, UUID>, ReviewRepository {
}