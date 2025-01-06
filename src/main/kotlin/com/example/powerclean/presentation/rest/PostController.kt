package com.example.powerclean.presentation.rest

import com.example.powerclean.application.service.PostService
import com.example.powerclean.presentation.dto.CreatePostReqDto
import com.example.powerclean.presentation.dto.CreatePostResDto
import com.example.powerclean.presentation.dto.GetPostDetailResDto
import com.example.powerclean.presentation.dto.GetPostListResDto
import com.example.powerclean.presentation.dto.UpdatePostReqDto
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PatchMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import java.util.UUID

@RestController
@RequestMapping("/post")
class PostController(private val postService: PostService) {
    @PostMapping()
    fun createPost(
        @RequestBody request: CreatePostReqDto,
    ): CreatePostResDto = postService.createPost(request)

    @GetMapping()
    fun getPostDetail(
        @RequestParam postId: UUID,
    ): GetPostDetailResDto = postService.getPostDetail(postId)

    @GetMapping("/list")
    fun getPostList(
        @RequestParam page: Int,
        @RequestParam size: Int,
    ): GetPostListResDto = postService.getPostList(page, size)

    @PatchMapping()
    fun updatePost(
        @RequestBody request: UpdatePostReqDto,
    ): String = postService.updatePost(request)

    @DeleteMapping()
    fun deletePost(
        @RequestParam postId: UUID,
    ): String = postService.deletePost(postId)
}
