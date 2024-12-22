import org.springframework.data.jpa.repository.JpaRepository

public interface JpaBookRepository : JpaRepository<Book, Long>, BookRepository {
}