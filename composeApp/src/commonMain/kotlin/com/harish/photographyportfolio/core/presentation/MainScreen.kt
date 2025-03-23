package com.harish.photographyportfolio.core.presentation

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.harish.photographyportfolio.home.presentation.HomeSection

@Composable
fun MainScreenRoot(
    modifier: Modifier = Modifier,
    mainContentHeight: Int? = null,
) {
    MainScreen(
        modifier,
        mainContentHeight
    )

}

@Composable
fun MainScreen(modifier: Modifier, mainContentHeight: Int?) {
    Box(modifier = Modifier.fillMaxSize()) {
        LazyColumn(modifier = Modifier.fillMaxSize()) {
            item {
                HomeSection(modifier, mainContentHeight)
            }
        }
    }
}






