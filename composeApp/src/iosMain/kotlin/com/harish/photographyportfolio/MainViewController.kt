package com.harish.photographyportfolio

import androidx.compose.ui.window.ComposeUIViewController
import com.harish.photographyportfolio.core.di.initKoin
import com.harish.photographyportfolio.core.presentation.App

fun MainViewController() = ComposeUIViewController(
    configure = {
        initKoin()
    }
) {
    App()
}