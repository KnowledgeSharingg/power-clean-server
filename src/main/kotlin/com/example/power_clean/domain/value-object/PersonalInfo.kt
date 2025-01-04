import jakarta.persistence.Embeddable
import jakarta.persistence.Column

@Embeddable
class PersonalInfo(
    @Column(name = "name", nullable = false)
    val name: String,

    @Column(name = "date_of_birth", nullable = true)
    val dateOfBirth: String,

    @Column(name = "phone_number", nullable = true)
    val phoneNumber: String,

    @Column(name = "gender", nullable = true)
    val gender: String
){}