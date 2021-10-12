package com.aqua.publisher.homepage

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.aqua.publisher.database.Article
import com.aqua.publisher.publisharticle.collectionPath
import com.google.firebase.firestore.FirebaseFirestore
import java.util.*

class HomePageViewModel : ViewModel() {

    // article
    private val _article = MutableLiveData<List<Article>>()
    val article: LiveData<List<Article>>
        get() = _article

    // 監聽
    val db = FirebaseFirestore.getInstance()
    fun getFirebaseData() {
        db.collection(collectionPath).addSnapshotListener { value, error ->
            _article.value = value?.toObjects(Article::class.java) ?: mutableListOf()
        }
        Log.d("db","${Article().title}")
    }

    init {
        getFirebaseData()
    }


}