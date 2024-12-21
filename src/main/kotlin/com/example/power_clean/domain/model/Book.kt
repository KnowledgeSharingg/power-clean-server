import jakarta.persistence.Entity
import jakarta.persistence.Table
import jakarta.persistence.Column
import jakarta.persistence.OneToOne
import jakarta.persistence.JoinColumn
import jakarta.persistence.ForeignKey
import jakarta.persistence.ConstraintMode
import org.hibernate.mapping.Constraint

// TODO: Value Object
@Entity
@Table(name = "book")
class Book(
    @Column(name = "title", nullable = false)
    var title: String,

    @Column(name="content", nullable = false)
    var content: String,

    @Column(name="author", nullable = false)
    var author: String,

    @Column(name="post_id", nullable = false)
    var postId: Long,

    @OneToOne()
    @JoinColumn(name = "post_id", foreignKey = ForeignKey(ConstraintMode.NO_CONSTRAINT))
    var post: Post
): BaseEntity() {}