package com.example.powerclean.domain.model

import jakarta.persistence.Column
import jakarta.persistence.ConstraintMode
import jakarta.persistence.Entity
import jakarta.persistence.FetchType
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
    // TODO: 주인 쪽에 cascade 설정 해도되나 ?
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "post_id", foreignKey = ForeignKey(ConstraintMode.NO_CONSTRAINT))
    var post: Post,
) : BaseEntity()
