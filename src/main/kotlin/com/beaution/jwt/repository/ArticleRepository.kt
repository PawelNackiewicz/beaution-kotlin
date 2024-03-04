package com.beaution.jwt.repository

import com.beaution.jwt.model.Article
import org.springframework.stereotype.Repository
import java.util.UUID

@Repository
class ArticleRepository {
    private val articles = listOf(
        Article(
            id = UUID.randomUUID(),
            title = "Hello",
            content = "Hello, world!"
        ),
        Article(
            id = UUID.randomUUID(),
            title = "Kotlin",
            content = "Kotlin is a programming language."
        )
    )

    fun findAll(): List<Article> = articles
}