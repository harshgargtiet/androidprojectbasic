package com.example.styleswag.controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import com.example.styleswag.Adapters.ProductAdapter
import com.example.styleswag.R
import com.example.styleswag.Services.Dataservices
import com.example.styleswag.Utilities.EXTRA_CATEGORY
import kotlinx.android.synthetic.main.activity_product.*

class ProductActivity : AppCompatActivity() {
    lateinit var  adapter : ProductAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product)
      val categoryType=  intent.getStringExtra(EXTRA_CATEGORY)
        adapter = ProductAdapter(this ,Dataservices.getProducts(categoryType.toString()))
        val layoutManager=GridLayoutManager(this,1)
        productlistview.layoutManager =layoutManager
        productlistview.adapter=adapter

       // println(CategoryType)
    }
}