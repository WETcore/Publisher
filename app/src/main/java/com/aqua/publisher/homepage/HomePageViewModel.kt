package com.aqua.publisher.homepage

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.aqua.publisher.database.Article
import com.aqua.publisher.database.remote.ArticleRemoteDataSource
import com.aqua.publisher.publisharticle.collectionPath
import com.google.firebase.firestore.FirebaseFirestore
import java.util.*

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