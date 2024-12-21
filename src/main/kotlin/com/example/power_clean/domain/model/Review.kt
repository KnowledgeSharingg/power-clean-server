import jakarta.persistence.Entity
import jakarta.persistence.Table
import jakarta.persistence.Column

@Entity
@Table(name = "review")
class Review(
    @Column(name = "content", nullable = false)
    var content: String,

    @Column(name="rating", nullable = false)
    var rating: Int,

    @Column(name="post_id", nullable = false)
    var postId: Long
): BaseEntity() {}