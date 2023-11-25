package com.example.meditationui.ui.theme

import androidx.annotation.DrawableRes
import androidx.compose.ui.graphics.Color

data class Features(
    val title: String,
    @DrawableRes val IconId: Int,
    val mediumColor: Color,
    val darkColor: Color,
    val lightColor: Color,
)