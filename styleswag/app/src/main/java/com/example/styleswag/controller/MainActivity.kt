package com.example.styleswag.controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.example.styleswag.Adapters.CategoryAdapter
import com.example.styleswag.R
import com.example.styleswag.Services.Dataservices
import com.example.styleswag.model.Category
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    lateinit var adapter : CategoryAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        adapter = CategoryAdapter(this,Dataservices.categories)
        categorylistview.adapter=adapter
    }
}
