package com.harish.photographyportfolio.core.util

import androidx.compose.ui.graphics.Color


fun String.toColor(): Color {
    return Color(("ff" + this.removePrefix("#").lowercase()).toLong(16))
}