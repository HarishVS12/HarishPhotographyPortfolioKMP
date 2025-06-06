package com.harish.photographyportfolio.core.presentation.screen

import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.harish.photographyportfolio.main.presentation.screen.MainScreenRoot
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun App() {
    MaterialTheme {
        MainScreenRoot(Modifier)
    }
}