import org.springframework.data.jpa.repository.JpaRepository
import AccountRepository

public interface JpaAccountRepository : JpaRepository<Account, Long>, AccountRepository {
}