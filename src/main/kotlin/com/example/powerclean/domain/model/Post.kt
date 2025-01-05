package com.example.powerclean.domain.model

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Table

@Entity
@Table(name = "post")
class Post(
    @Column(name = "title", nullable = false)
    var title: String,
    @Column(name = "content", nullable = false)
    var content: String,
    @Column(name = "creator_account_id", nullable = false)
    var creatorAccountId: Long,
    @Column(name = "like_count", nullable = false)
    var likeCount: Int,
) : BaseEntity()
