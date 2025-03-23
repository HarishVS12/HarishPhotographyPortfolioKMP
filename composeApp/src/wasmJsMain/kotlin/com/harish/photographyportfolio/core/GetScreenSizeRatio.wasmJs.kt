package com.harish.photographyportfolio.core

import kotlinx.browser.window

actual fun getViewPortHeight(): Int? {
    return window.innerHeight
}