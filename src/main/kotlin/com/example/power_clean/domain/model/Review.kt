package com.example.power_clean.domain.model


import jakarta.persistence.Entity
import jakarta.persistence.Table
import jakarta.persistence.Column
import jakarta.persistence.ManyToOne
import jakarta.persistence.JoinColumn
import jakarta.persistence.ForeignKey
import jakarta.persistence.ConstraintMode

@Entity
@Table(name = "review")
class Review(
    @Column(name = "content", nullable = false)
    var content: String,

    @Column(name="rating", nullable = false)
    var rating: Int,

    @Column(name="post_id", nullable = false)
    var postId: Long,

    @ManyToOne()
    @JoinColumn(name = "post_id", foreignKey = ForeignKey(ConstraintMode.NO_CONSTRAINT))
    var post: Post
): BaseEntity() {}