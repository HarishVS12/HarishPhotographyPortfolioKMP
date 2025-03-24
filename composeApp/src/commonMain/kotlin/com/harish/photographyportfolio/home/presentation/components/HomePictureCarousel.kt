package com.harish.photographyportfolio.home.presentation.components

import androidx.compose.foundation.background
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
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import coil3.compose.AsyncImage
import kotlinx.coroutines.delay

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
        state = lazyListState,
        flingBehavior = rememberSnapFlingBehavior(lazyListState = lazyListState),
    ) {
        items(items, key = { it }) {
            AsyncImage(
                model = "https://media-hosting.imagekit.io//6961d85521414229/1727775083170.jpeg?Expires=1837439823&Key-Pair-Id=K2ZIVPTIP2VGHC&Signature=KRcvx~0YdMDhIewzvjAtJH2LLkfqxXk2FxVwp5f1rYyyFsVjl885rPPkb4mB-ktcsc-iGo01idtnXYepV6CFCEUqYrgR~B4ZYo92mf8Y8N4SjkUMVv06u197MCd5aNXexPiN~nNKyX4myLxX65ksYuKsaqWtma93Y7ZkAf6Sw4PGHMpsvfKeLln3XcnS1wEkGVy2grmMj06xI6F6ODM4uOhY2yku04nOzbT5z8LI8cBG6sxM8Y6gZ-XCKXxOJ2eWJz2Rcg9636gRHrB9Fjq~8D8mETVBbcT36rPycUepzqEtB~5zd8ZQHN2tIcY-U7Qdew~7XRYVFpNwsWL7cstXPQ__",
                contentDescription = "image",
                contentScale = ContentScale.FillBounds,
                modifier = Modifier
                    .height(mainContentSize?.first?.dp!!)
                    .width(mainContentSize.second.dp)
                    .background(Color.Black)
                    .alpha(0.5f)

            )
        }
    }
}