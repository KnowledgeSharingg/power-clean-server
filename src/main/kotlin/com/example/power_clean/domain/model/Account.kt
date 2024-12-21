import jakarta.persistence.Entity
import jakarta.persistence.Table
import jakarta.persistence.Column

@Entity
@Table(name = "account")
class Account(
    @Column(name="name", nullable = false)
    var name: String,

    @Column(name="email", nullable = false, unique = true)
    var email: String,

    @Column(name="password", nullable = false)
    var password: String
): BaseEntity() {}