package kg.junesqo.newsapp

import androidx.room.Entity
import androidx.room.PrimaryKey

data class Article(

    var id: Int? = null,
    val author: String,
    val content: String,
    val description: String,
    val publishedAt: String,
    val source: Source,
    val title: String,
    val url: String,
    val urlToImage: String
)