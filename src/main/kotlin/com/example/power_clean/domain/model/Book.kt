package com.example.power_clean.domain.model

import jakarta.persistence.Entity
import jakarta.persistence.Table
import jakarta.persistence.Column
import jakarta.persistence.OneToOne
import jakarta.persistence.JoinColumn
import jakarta.persistence.ForeignKey
import jakarta.persistence.ConstraintMode
import jakarta.persistence.Embedded
import org.hibernate.mapping.Constraint
import AuthorInfo
import com.example.power_clean.domain.model.Post


@Entity
@Table(name = "book")
class Book(
    @Column(name = "title", nullable = false)
    var title: String,

    @Column(name="content", nullable = false)
    var content: String,

    @Column(name="link", nullable = false)
    var link: String,

    @Embedded
    var authorInfo: AuthorInfo,

    @Column(name="post_id", nullable = false)
    var postId: Long,

    @OneToOne()
    @JoinColumn(name = "post_id", foreignKey = ForeignKey(ConstraintMode.NO_CONSTRAINT))
    var post: Post
): BaseEntity() {}