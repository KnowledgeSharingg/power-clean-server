package com.example.power_clean.domain.repository.orm.jpa

import org.springframework.data.jpa.repository.JpaRepository
import com.example.power_clean.domain.model.Post
import com.example.power_clean.domain.repository.PostRepository
import java.util.UUID

public interface JpaPostRepository : JpaRepository<Post, UUID>, PostRepository {
}