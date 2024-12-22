

import org.springframework.data.jpa.repository.JpaRepository

public interface JpaPostRepository : JpaRepository<Post, Long>, PostRepository {
}