package com.example.myapplication.List.models

import android.media.Image
import androidx.annotation.DrawableRes

data class ProductModel(
    val id:Int,
    val productName: String,
    val desc: String?,
    val price: Float,
    @DrawableRes val image: Int
)
