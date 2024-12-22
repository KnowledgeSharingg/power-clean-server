import jakarta.persistence.Entity
import jakarta.persistence.Table
import jakarta.persistence.Column
import jakarta.persistence.Embedded
import PersonalInfo

@Entity
@Table(name = "account")
class Account(
    @Column(name="email", nullable = false, unique = true)
    var email: String,

    @Column(name="password", nullable = false)
    var password: String,

    @Embedded
    var personalInfo: PersonalInfo

): BaseEntity() {}