package com.example.act5_listajuegos.models

import androidx.annotation.DrawableRes

data class Game(
    val name: String,
    val price: Int,
    val console: String,
    val classification: String,
    @DrawableRes val image: Int,
)