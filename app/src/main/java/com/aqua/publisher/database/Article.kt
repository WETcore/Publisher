package com.aqua.publisher.database

data class Article(
    val data: List<Data>,
    val title: String,
    val content: String,
    val createdTime: String,
    val id: String,
    val category: String,
)

data class Data(
    val author: List<Author>,
)

data class Author(
    val email: String,
    val id: String,
    val name: String,
)
