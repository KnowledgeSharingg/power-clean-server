package com.example.powerclean.domain.repository.orm.jpa

import com.example.powerclean.domain.model.Review
import com.example.powerclean.domain.repository.ReviewRepository
import org.springframework.data.jpa.repository.JpaRepository
import java.util.UUID

public interface JpaReviewRepository : JpaRepository<Review, UUID>, ReviewRepository
