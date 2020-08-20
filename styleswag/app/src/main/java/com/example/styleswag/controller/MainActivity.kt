package com.example.styleswag.controller

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.styleswag.Adapters.CategoryAdapter
import com.example.styleswag.Adapters.CategoryRecycleAdapter
import com.example.styleswag.R
import com.example.styleswag.Services.Dataservices
import com.example.styleswag.Utilities.EXTRA_CATEGORY
import com.example.styleswag.model.Category
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    lateinit var adapter : CategoryRecycleAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        adapter = CategoryRecycleAdapter(this,Dataservices.categories){category: Category ->
            val productIntent =Intent(this,ProductActivity::class.java )
            productIntent.putExtra(EXTRA_CATEGORY,category.title)
            startActivity(productIntent)
        }
        categorylistview.adapter=adapter
        val layoutManager=LinearLayoutManager(this )
        categorylistview.layoutManager=layoutManager
        categorylistview.setHasFixedSize(true)
    }
}
