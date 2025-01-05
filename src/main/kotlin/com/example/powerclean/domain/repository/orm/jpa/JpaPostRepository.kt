package com.example.powerclean.domain.repository.orm.jpa

import com.example.powerclean.domain.model.Post
import com.example.powerclean.domain.repository.PostRepository
import org.springframework.data.jpa.repository.JpaRepository
import java.util.UUID

public interface JpaPostRepository : JpaRepository<Post, UUID>, PostRepository
