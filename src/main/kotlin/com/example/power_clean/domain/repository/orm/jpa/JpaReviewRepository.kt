

import org.springframework.data.jpa.repository.JpaRepository

public interface JpaReviewRepository :JpaRepository<Review, Long>, ReviewRepository {
}