package com.aqua.publisher.homepage

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.aqua.publisher.database.Article
import com.aqua.publisher.database.remote.ArticleRemoteDataSource

class HomePageViewModel : ViewModel() {

    // article
    private var _article = ArticleRemoteDataSource.getArticles()
    val article: LiveData<List<Article>>
        get() = _article

    // 監聽
    fun getFirebaseData() {
        ArticleRemoteDataSource.getArticles()
    }

    init {
        getFirebaseData()
    }


}