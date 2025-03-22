package com.harish.photographyportfolio.core.presentation

import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import com.harish.photographyportfolio.core.di.sharedModule
import org.jetbrains.compose.ui.tooling.preview.Preview
import org.koin.compose.KoinApplication

@Composable
@Preview
fun App() {
    KoinApplication(application = { modules(sharedModule) }) {
        MaterialTheme {
            MainScreenRoot()
        }
    }
}