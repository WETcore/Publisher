package com.aqua.publisher.database

import androidx.lifecycle.LiveData

interface ArticleRepository {
    fun getArticles(): LiveData<List<Article>>
}