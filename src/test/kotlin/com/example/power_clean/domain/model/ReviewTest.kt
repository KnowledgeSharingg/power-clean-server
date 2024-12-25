import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class ReviewTest {

    @Test
    fun testReviewCreation() {
        // Create a sample Post object
        val post = Post("Sample Title", "Sample Content", 12345L, 10)

        // Create a sample Review object
        val review = Review("Sample Review Content", 5, 12345L, post)

        // Perform assertions to verify the review properties
        assertEquals("Sample Review Content", review.content)
        assertEquals(5, review.rating)
        assertEquals(12345L, review.postId)
        assertEquals(post, review.post)
    }
}