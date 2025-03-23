package com.harish.photographyportfolio

import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.window.ComposeViewport
import com.harish.photographyportfolio.core.di.initKoin
import com.harish.photographyportfolio.core.presentation.App
import kotlinx.browser.document
import kotlinx.browser.window
import org.w3c.dom.events.Event

@OptIn(ExperimentalComposeUiApi::class)
fun main() {
    initKoin()
    ComposeViewport(document.body!!) {
        window.dispatchEvent(Event("ComposeReady"))
        App()
    }
}