package com.harish.photographyportfolio.main.presentation.components.home

import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.snapping.rememberSnapFlingBehavior
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import coil3.compose.AsyncImage
import com.harish.photographyportfolio.main.domain.CarouselImage
import kotlinx.coroutines.delay

@Composable
fun HomePictureCarousel(
    modifier: Modifier = Modifier,
    homeCarouselList: List<CarouselImage>?
) {
    val lazyListState = rememberLazyListState()

    LaunchedEffect(null) {
        var pos = 0
        while (true) {
            if (pos >= (homeCarouselList?.size ?: 0))
                pos = 0
            lazyListState.animateScrollToItem(
                index = pos
            )
            pos++
            delay(3500)
        }
    }

    LazyRow(
        modifier = Modifier.wrapContentSize(),
        state = lazyListState,
        flingBehavior = rememberSnapFlingBehavior(lazyListState = lazyListState),
    ) {
        println("homeCarouselList $homeCarouselList")
        items(homeCarouselList ?: listOf(), key = { it.imageUrl?:"" }) {
            AsyncImage(
                model = it.imageUrl,
                contentDescription = "image",
                contentScale = ContentScale.Crop,
                modifier = modifier
                    .background(Color.Black)
                    .alpha(0.5f)
            )
        }
    }
}