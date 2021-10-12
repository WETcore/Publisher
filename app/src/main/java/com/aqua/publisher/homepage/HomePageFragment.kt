package com.aqua.publisher.homepage

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.aqua.publisher.R
import com.aqua.publisher.database.Article
import com.aqua.publisher.databinding.HomePageFragmentBinding

class HomePageFragment : Fragment() {

    private val viewModel: HomePageViewModel by lazy {
        ViewModelProvider(this).get(HomePageViewModel::class.java)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // binding
        val binding: HomePageFragmentBinding =
            DataBindingUtil.inflate(inflater, R.layout.home_page_fragment, container,false)

        // get firebase data
        viewModel.getFirebaseData()

        // set UI value

        // recycler
        val adapter = ArticleAdapter()
        binding.recycler.adapter = adapter

        // observe article
        viewModel.article.observe(viewLifecycleOwner) {
            adapter.submitList(it)
        }

        return binding.root
    }
}