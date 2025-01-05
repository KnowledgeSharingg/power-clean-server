package com.example.powerclean.domain.model

import io.kotest.core.spec.style.BehaviorSpec
import io.kotest.matchers.shouldBe
import io.mockk.every
import io.mockk.mockk

class PostTest : BehaviorSpec({

    Given("a Post object") {
        val post = Post("Sample Title", "Sample Content", 12345L, 10)

        When("getting the post properties") {
            Then("the properties should match the initial values") {
                post.title shouldBe "Sample Title"
                post.content shouldBe "Sample Content"
                post.creatorAccountId shouldBe 12345L
                post.likeCount shouldBe 10
            }
        }
    }

    Given("a Post object with mocked dependencies") {
        val mockPost = mockk<Post>()

        When("setting the post properties") {
            every { mockPost.title } returns "Mocked Title"
            every { mockPost.content } returns "Mocked Content"
            every { mockPost.creatorAccountId } returns 54321L
            every { mockPost.likeCount } returns 5

            Then("the properties should be set correctly") {
                mockPost.title shouldBe "Mocked Title"
                mockPost.content shouldBe "Mocked Content"
                mockPost.creatorAccountId shouldBe 54321L
                mockPost.likeCount shouldBe 5
            }
        }
    }
})
