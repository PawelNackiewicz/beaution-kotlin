package com.beaution.jwt.controller.article

import com.beaution.jwt.model.Article
import com.beaution.jwt.service.ArticleService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/articles")
class ArticleController(
    private val articleService: ArticleService
) {
    @GetMapping
    fun listAll(): List<ArticleResponse> = articleService.findAll().map {
        it.toResponse()
    }

    private fun Article.toResponse() = ArticleResponse(
        id = id.toString(),
        title = title,
        content = content
    )
}