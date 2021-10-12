package com.aqua.publisher

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import com.aqua.publisher.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        ///binding
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // nav host
        val navHostFragment = findNavController(R.id.nav_host)

        // switch page
        binding.floatingActionButton.setOnClickListener {
            navHostFragment.navigate(NavGraphDirections.navToPublishArticle())
        }
    }
}