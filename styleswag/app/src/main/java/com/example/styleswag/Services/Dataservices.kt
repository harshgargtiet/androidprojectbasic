package com.example.styleswag.Services

import com.example.styleswag.model.Category
import com.example.styleswag.model.Product

object Dataservices {
    val categories= listOf(
        Category( "SHOES","shoecover"),
        Category("TSHIRTS","tshirtcover")
    )
    val shoes = listOf(
        Product("SHOES1","Rs1200","shoe1"),
        Product("SHOES2","Rs1300","shoe2"),
        Product("SHOES3","Rs1400","shoe3"),
        Product("SHOES4","Rs1500","shoe4")
    )
    val tshirt = listOf(
        Product("TSHIRT1","Rs1200","tshirt1"),
        Product("TSHIRT2","Rs1300","tshirt2"),
        Product("TSHIRT3","Rs1400","tshirt3"),
        Product("TSHIRT4","Rs1500","tshirt4")
    )
}