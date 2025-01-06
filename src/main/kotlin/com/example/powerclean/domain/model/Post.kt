package com.example.powerclean.domain.model

import jakarta.persistence.CascadeType
import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.FetchType
import jakarta.persistence.OneToOne
import jakarta.persistence.Table
import java.util.UUID


@Entity
@Table(name = "post")
class Post(
    @Column(name = "title", nullable = false)
    var title: String,
    @Column(name = "content", nullable = false)
    var content: String,
    @Column(name = "creator_account_id", nullable = false)
    var creatorAccountId: UUID,
    @Column(name = "like_count", nullable = false)
    var likeCount: Int,
    @OneToOne(mappedBy = "post", cascade = [CascadeType.ALL], fetch = FetchType.LAZY, optional = true)
    var book: Book? = null,
) : BaseEntity()
