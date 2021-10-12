package com.aqua.publisher

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.aqua.publisher.databinding.PublishArticleFragmentBinding

class PublishArticleFragment : Fragment() {

    private lateinit var viewModel: PublishArticleViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding: PublishArticleFragmentBinding =
            DataBindingUtil.inflate(inflater, R.layout.publish_article_fragment, container,false)

        return binding.root
    }


}