package com.aqua.publisher.publisharticle

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.aqua.publisher.R
import com.aqua.publisher.databinding.PublishArticleFragmentBinding

class PublishArticleFragment : Fragment() {

    private val viewModel: PublishArticleViewModel by lazy {
        ViewModelProvider(this).get(PublishArticleViewModel::class.java)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding: PublishArticleFragmentBinding =
            DataBindingUtil.inflate(inflater, R.layout.publish_article_fragment, container,false)

        return binding.root
    }


}