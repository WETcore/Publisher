package com.aqua.publisher

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.aqua.publisher.databinding.HomePageFragmentBinding

class HomePageFragment : Fragment() {

    private lateinit var viewModel: HomePageViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding: HomePageFragmentBinding =
            DataBindingUtil.inflate(inflater, R.layout.home_page_fragment, container,false)
        return binding.root
    }

}