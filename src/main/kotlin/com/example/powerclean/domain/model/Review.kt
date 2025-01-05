package com.example.powerclean.domain.model

import jakarta.persistence.Column
import jakarta.persistence.ConstraintMode
import jakarta.persistence.Entity
import jakarta.persistence.ForeignKey
import jakarta.persistence.JoinColumn
import jakarta.persistence.ManyToOne
import jakarta.persistence.Table

@Entity
@Table(name = "review")
class Review(
    @Column(name = "content", nullable = false)
    var content: String,
    @Column(name = "rating", nullable = false)
    var rating: Int,
    @ManyToOne()
    @JoinColumn(name = "post_id", foreignKey = ForeignKey(ConstraintMode.NO_CONSTRAINT))
    var post: Post,
) : BaseEntity()
