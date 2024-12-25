import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

import io.kotest.core.spec.style.BehaviorSpec
import io.kotest.matchers.shouldBe
import io.mockk.every
import io.mockk.mockk

class AccountTest : BehaviorSpec({
    Given("Account") {
        val mockedPersonalInfo = mockk<PersonalInfo>()
        val account = Account("test@example.com", "password123", mockedPersonalInfo)

        When("getting the email") {
            Then("it should return the email") {
                account.email shouldBe "test@example.com"
            }
        }

        When("getting the password") {
            Then("it should return the password") {
                account.password shouldBe "password123"
            }
        }

        When("getting the personal info") {
            every { mockedPersonalInfo.name } returns "Mocked Name"
            every { mockedPersonalInfo.dateOfBirth } returns "960707"
            every { mockedPersonalInfo.phoneNumber } returns "01012341234"
            every { mockedPersonalInfo.gender } returns "other"
            val personalInfoResult = account.personalInfo

            Then("it should return the mocked personal info") {
                personalInfoResult shouldBe mockedPersonalInfo
            }
        }
    }
})