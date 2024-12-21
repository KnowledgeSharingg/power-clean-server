import java.time.LocalDateTime
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.MappedSuperclass
import org.springframework.data.annotation.Id 

@MappedSuperclass 
open class BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null
    var createdAt: LocalDateTime = LocalDateTime.now()
    var updatedAt: LocalDateTime = LocalDateTime.now()
    var deletedAt: LocalDateTime? = null
}