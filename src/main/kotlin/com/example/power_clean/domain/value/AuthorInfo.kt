import jakarta.persistence.Embeddable
import jakarta.persistence.Column

@Embeddable
class AuthorInfo(
    @Column(name = "author_name", nullable = false)
    val name: String,

    @Column(name = "author_date_of_birth", nullable = false)
    val dateOfBirth: String,

    @Column(name = "author_phone_number", nullable = false)
    val phoneNumber: String,

    @Column(name = "author_gender", nullable= false)
    val gender: String,

    @Column(name = "author_history", nullable = false)
    val history: String
)