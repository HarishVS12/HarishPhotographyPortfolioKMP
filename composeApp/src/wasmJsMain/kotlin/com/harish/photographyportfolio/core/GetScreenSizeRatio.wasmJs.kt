package com.harish.photographyportfolio.core

import kotlinx.browser.window

actual fun getViewPortSize(): Pair<Int, Int>? {
    return Pair(window.innerHeight, window.innerWidth)
}