package com.harish.photographyportfolio

import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.window.ComposeViewport
import com.harish.photographyportfolio.core.di.initKoin
import com.harish.photographyportfolio.core.di.sharedModule
import com.harish.photographyportfolio.core.presentation.App
import kotlinx.browser.document
import org.koin.core.context.startKoin

@OptIn(ExperimentalComposeUiApi::class)
fun main() {
    ComposeViewport(document.body!!) {
        App()
    }
}