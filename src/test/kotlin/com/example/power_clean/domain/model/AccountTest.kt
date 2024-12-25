import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class AccountTest {

    @Test
    fun testAccountCreation() {
        // Create a sample PersonalInfo object
        val personalInfo = PersonalInfo("lim", "960707",  "01012341234", "male")

        // Create an Account object
        val account = Account("test@example.com", "password123", personalInfo)

        // Perform assertions to verify the account properties
        assertEquals("test@example.com", account.email)
        assertEquals("password123", account.password)
        assertEquals(personalInfo, account.personalInfo)
    }
}