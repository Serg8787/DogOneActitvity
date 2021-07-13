package com.example.dogoneactitvity

import android.graphics.Bitmap



data class Dog(
    val avatar: Bitmap?,
    val name: String,
    val description: String,
    val desc2: String,
    var isHeart: Boolean = false,
   // var heartBitmap: Bitmap

)