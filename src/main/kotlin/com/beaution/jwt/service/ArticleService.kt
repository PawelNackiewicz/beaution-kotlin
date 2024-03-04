package com.beaution.jwt.service

import com.beaution.jwt.model.Article
import com.beaution.jwt.repository.ArticleRepository
import org.springframework.stereotype.Service

@Service
class ArticleService(
    private val articleRepository: ArticleRepository
) {
    fun findAll(): List<Article> = articleRepository.findAll()
}