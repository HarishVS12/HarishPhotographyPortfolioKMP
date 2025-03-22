package com.harish.photographyportfolio.core.presentation

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.harish.photographyportfolio.home.presentation.HomeScreenRoot

@Composable
fun MainScreenRoot(
    modifier: Modifier = Modifier,
) {
    MainScreen(
        modifier
    )

}

@Composable
fun MainScreen(modifier: Modifier) {
    Surface(modifier = Modifier.fillMaxSize()) {
        LazyColumn(modifier = Modifier.fillMaxSize()) {
            item {
                HomeScreenRoot(modifier)
            }
        }
    }
}






