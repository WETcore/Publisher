package com.aqua.publisher.database.remote

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.aqua.publisher.database.Article
import com.aqua.publisher.database.ArticleRepository
import com.aqua.publisher.publisharticle.collectionPath
import com.google.firebase.firestore.FirebaseFirestore

object ArticleRemoteDataSource: ArticleRepository {

    override fun getArticles(): LiveData<List<Article>> {
        val db = FirebaseFirestore.getInstance()
        val result = MutableLiveData<List<Article>>()
        result.let {
            db.collection(collectionPath).addSnapshotListener { value, error ->
                it.value = value?.toObjects(Article::class.java) ?: mutableListOf()
            }
        }
        Log.d("test","getArticles running")
        return result
    }
}