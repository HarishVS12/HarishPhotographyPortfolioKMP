package com.harish.photographyportfolio.main.presentation.components.home

import androidx.compose.foundation.layout.Box
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.harish.photographyportfolio.main.domain.CarouselImage


@Composable
fun HomeSection(
    modifier: Modifier = Modifier,
    homeCarouselList: List<CarouselImage>?,
    homeHeaderTextSize: Int,
    showNavTopBar: Boolean,
) {
    Box(
        modifier = Modifier
    ) {
        HomePictureCarousel(modifier, homeCarouselList)
        HomeNavBar(showNavTopBar = showNavTopBar)
        HomeHeader(
            modifier = Modifier
                .align(Alignment.Center),
            textSize = homeHeaderTextSize
        )
    }
}
