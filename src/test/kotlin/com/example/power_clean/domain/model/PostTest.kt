import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class PostTest {

    @Test
    fun testPostCreation() {
        // Create a sample Post object
        val post = Post("Sample Title", "Sample Content", 12345L, 10)

        // Perform assertions to verify the post properties
        assertEquals("Sample Title", post.title)
        assertEquals("Sample Content", post.content)
        assertEquals(12345L, post.creatorAccountId)
        assertEquals(10, post.likeCount)
    }
}