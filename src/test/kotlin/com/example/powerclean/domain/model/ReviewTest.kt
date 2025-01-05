package com.example.powerclean.domain.model

import io.kotest.core.spec.style.BehaviorSpec
import io.kotest.matchers.shouldBe
import io.mockk.mockk

class ReviewTest : BehaviorSpec({
    Given("a Review") {
        val postId = 12345L
        val post = mockk<Post>()
        val review = Review("Sample Review Content", 5, postId, post)

        When("getting the review properties") {
            Then("the content should be correct") {
                review.content shouldBe "Sample Review Content"
            }

            Then("the rating should be correct") {
                review.rating shouldBe 5
            }

            Then("the postId should be correct") {
                review.postId shouldBe postId
            }

            Then("the post should be correct") {
                review.post shouldBe post
            }
        }
    }

    Given("a Review with a mocked Post") {
        val postId = 12345L
        val post = mockk<Post>()

        When("creating a Review") {
            Then("the post should be set correctly") {
                val review = Review("Sample Review Content", 5, postId, post)
                review.post shouldBe post
            }
        }
    }
})
