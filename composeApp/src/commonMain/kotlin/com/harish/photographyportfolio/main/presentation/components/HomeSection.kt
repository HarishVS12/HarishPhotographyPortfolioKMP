package com.harish.photographyportfolio.main.presentation.components

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp


@Composable
fun HomeSection(
    modifier: Modifier = Modifier,
    mainContentSize: Pair<Int, Int>?,
    homeCarouselList: List<String>
) {
    Box(
        modifier = Modifier
            .height(mainContentSize?.first?.dp!!)
            .width(mainContentSize.second.dp)
    ) {
        HomePictureCarousel(modifier, mainContentSize, homeCarouselList)
        HomeHeader()
    }
}