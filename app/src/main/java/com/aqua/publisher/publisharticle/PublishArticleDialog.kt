package com.aqua.publisher.publisharticle

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.DialogFragment
import androidx.lifecycle.ViewModelProvider
import com.aqua.publisher.R
import com.aqua.publisher.databinding.PublishArticleDialogBinding

class PublishArticleDialog : DialogFragment() {

    private val viewModel: PublishArticleViewModel by lazy {
        ViewModelProvider(this).get(PublishArticleViewModel::class.java)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding: PublishArticleDialogBinding =
            DataBindingUtil.inflate(inflater, R.layout.publish_article_dialog, container,false)

        return binding.root
    }


}