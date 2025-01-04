package com.example.power_clean.domain.repository.orm.jpa

import org.springframework.data.jpa.repository.JpaRepository
import com.example.power_clean.domain.model.Post
import com.example.power_clean.domain.repository.PostRepository

public interface JpaPostRepository : JpaRepository<Post, Long>, PostRepository {
}