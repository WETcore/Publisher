package com.aqua.publisher.publisharticle

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.DialogFragment
import androidx.lifecycle.ViewModelProvider
import com.aqua.publisher.R
import com.aqua.publisher.database.Article
import com.aqua.publisher.databinding.PublishArticleDialogBinding

const val collectionPath = "Articles"

object document { lateinit var id: String}

class PublishArticleDialog : DialogFragment() {

    private val viewModel: PublishArticleViewModel by lazy {
        ViewModelProvider(this).get(PublishArticleViewModel::class.java)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // binding
        val binding: PublishArticleDialogBinding =
            DataBindingUtil.inflate(inflater, R.layout.publish_article_dialog, container,false)


        binding.apply {
            button.setOnClickListener {
                viewModel.article.title = binding.inputTitle.text.toString()
                viewModel.article.category = binding.inputCateogry.text.toString()
                viewModel.article.content = binding.inputContent.text.toString()
                // TODO
//                viewModel.article.data = "Aqua"
//                viewModel.author.email = "test@gmail.com"

//                viewModel.db.collection(collectionPath).add(viewModel.article)
                viewModel.db.collection(collectionPath).add(viewModel.data)
            }
        }





        return binding.root
    }


}