package com.harish.photographyportfolio.core.presentation

import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import com.harish.photographyportfolio.core.getViewPortHeight
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun App() {
    val mainContentHeight = remember { getViewPortHeight() }
    MaterialTheme {
        MainScreenRoot(Modifier, mainContentHeight)
    }
}