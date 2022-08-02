package kg.junesqo.newsapp.repository

import kg.junesqo.newsapp.api.RetrofitInstance
import kg.junesqo.newsapp.db.ArticleDatabase

class NewsRepository(val db: ArticleDatabase) {
    suspend fun getBreakingNews(countryCode: String, pageNumber: Int) =
        RetrofitInstance.api.getBreakingNews(countryCode, pageNumber)

    suspend fun searchNews(searchQuery: String, pageNumber: Int) =
        RetrofitInstance.api.searchForNews(searchQuery, pageNumber)
}