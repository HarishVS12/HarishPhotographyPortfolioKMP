package com.harish.photographyportfolio.home.presentation.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.gestures.snapping.rememberSnapFlingBehavior
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import harishphotographyportfolio.composeapp.generated.resources.Res
import harishphotographyportfolio.composeapp.generated.resources.himachal
import kotlinx.coroutines.delay
import org.jetbrains.compose.resources.painterResource

@Composable
fun HomePictureCarousel(
    modifier: Modifier = Modifier,
    mainContentSize: Pair<Int, Int>?
) {
    val lazyListState = rememberLazyListState()

    LaunchedEffect(null) {
        var pos = 0
        while (true) {
            if (pos > 5) {
                pos = 0
            }
            lazyListState.animateScrollToItem(
                index = pos
            )
            pos++
            delay(3500)
        }
    }

    val items = (1..5).map { "Item $it" }
    LazyRow(
        modifier = Modifier.wrapContentSize(),
        flingBehavior = rememberSnapFlingBehavior(lazyListState = lazyListState),
    ) {
        items(items, key = { it }) {
            Image(
                painter = painterResource(Res.drawable.himachal),
                contentDescription = "image",
                contentScale = ContentScale.FillBounds,
                modifier = Modifier
                    .height(mainContentSize?.first?.dp!!)
                    .width(mainContentSize.second.dp)
            )
        }
    }
}