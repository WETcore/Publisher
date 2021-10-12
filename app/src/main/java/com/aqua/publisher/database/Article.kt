package com.aqua.publisher.database

data class Article(
    var author: MutableMap<String, String> = mutableMapOf(
        "email" to "",
        "id" to "",
        "name" to ""),
    var title: String = "",
    var content: String = "",
    var createdTime: Long = 0L,
    var id: String = "",
    var category: String = "",
)