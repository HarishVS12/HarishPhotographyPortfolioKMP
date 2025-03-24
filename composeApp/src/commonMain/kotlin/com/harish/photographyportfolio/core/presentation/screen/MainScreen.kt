package com.harish.photographyportfolio.core.presentation.screen

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.harish.photographyportfolio.core.presentation.vm.MainScreenViewModel
import com.harish.photographyportfolio.home.presentation.HomeSection
import org.koin.compose.viewmodel.koinViewModel

@Composable
fun MainScreenRoot(
    modifier: Modifier = Modifier,
    mainScreenViewModel: MainScreenViewModel = koinViewModel(),
) {
    val mainScreenState = mainScreenViewModel.mainScreenState.collectAsStateWithLifecycle()
    MainScreen(
        modifier,
        mainScreenState.value.homeItemViewportSize
    )

}

@Composable
fun MainScreen(modifier: Modifier, mainContentSize: Pair<Int, Int>?) {
    Box(modifier = Modifier.fillMaxSize()) {
        LazyColumn(modifier = Modifier.fillMaxSize()) {
            item {
                HomeSection(modifier, mainContentSize)
            }
        }
    }
}






