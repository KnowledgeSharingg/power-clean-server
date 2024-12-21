import jakarta.persistence.Entity
import jakarta.persistence.Table
import jakarta.persistence.Column

// TODO: Value Object
// TODO: Relation mapping

@Entity
@Table(name = "book")
class Book(
    @Column(name = "title", nullable = false)
    var title: String,

    @Column(name="content", nullable = false)
    var content: String,

    @Column(name="author", nullable = false)
    var author: String,
): BaseEntity() {}