package com.aqua.publisher.publisharticle

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.DialogFragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.aqua.publisher.R
import com.aqua.publisher.database.Article
import com.aqua.publisher.databinding.PublishArticleDialogBinding
import com.google.firebase.firestore.FirebaseFirestore
import java.util.*

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
                viewModel.article.apply {
                    title = binding.inputTitle.text.toString()
                    category = binding.inputCateogry.text.toString()
                    content = binding.inputContent.text.toString()
                    author["name"] = "Aqua"
                    author["email"] = "aqua@gmail.com"
                    author["id"] = "aquaman"
                    createdTime = Calendar.getInstance().timeInMillis
                    id = viewModel.document.id
                }
                if (viewModel.article.author["name"].isNullOrEmpty() ||
                    viewModel.article.author["email"].isNullOrEmpty() ||
                    viewModel.article.author["id"].isNullOrEmpty()
                        ) {
                    Toast.makeText(requireContext(),"No author info.", Toast.LENGTH_SHORT).show()
                } else {
                    findNavController().popBackStack()
                    viewModel.db.collection(collectionPath).add(viewModel.article)
                }
            }
        }





        return binding.root
    }


}