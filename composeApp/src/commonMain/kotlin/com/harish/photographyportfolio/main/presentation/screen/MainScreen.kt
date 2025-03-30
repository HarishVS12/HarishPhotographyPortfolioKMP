package com.harish.photographyportfolio.main.presentation.screen

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.harish.photographyportfolio.main.presentation.components.about.AboutSection
import com.harish.photographyportfolio.main.presentation.viewmodel.MainScreenViewModel
import com.harish.photographyportfolio.main.presentation.components.home.HomeSection
import org.koin.compose.viewmodel.koinViewModel

@Composable
fun MainScreenRoot(
    modifier: Modifier = Modifier,
    mainScreenViewModel: MainScreenViewModel = koinViewModel(),
) {
    val mainScreenState = mainScreenViewModel.mainScreenState.collectAsStateWithLifecycle()
    MainScreen(
        modifier,
        mainScreenState.value.homeItemViewportSize,
        mainScreenState.value.homeCarouselList
    )

}

@Composable
fun MainScreen(
    modifier: Modifier,
    mainContentSize: Pair<Int, Int>?,
    homeCarouselList: List<String>
) {
    Box(modifier = Modifier.fillMaxSize()) {
        LazyColumn(modifier = Modifier.fillMaxSize()) {
            item {
                HomeSection(
                    modifier
                        .height(mainContentSize?.first?.dp!!)
                        .width(mainContentSize.second.dp),
                    homeCarouselList
                )
            }
            item {
                AboutSection(
                    modifier
                        .height(mainContentSize?.first?.dp!!)
                        .width(mainContentSize.second.dp)
                )
            }
        }
    }
}






