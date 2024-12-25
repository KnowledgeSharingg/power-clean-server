import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class BookTest {

    @Test
    fun testBookCreation() {
        // Create a sample AuthorInfo object
        val authorInfo = AuthorInfo("John Doe", "960707", "01012341234", "male", "Borned in Ulsaan.")

        // Create a sample Post object
        val post = Post("Sample Post", "Sample Content", 12345L, 10)

        // Create a Book object
        val book = Book("Sample Book", "Sample Content", "samplelink.com", authorInfo, 1, post)

        // Perform assertions to verify the book properties
        assertEquals("Sample Book", book.title)
        assertEquals("Sample Content", book.content)
        assertEquals("samplelink.com", book.link)
        assertEquals(authorInfo, book.authorInfo)
        assertEquals(1, book.postId)
        assertEquals(post, book.post)
    }
}