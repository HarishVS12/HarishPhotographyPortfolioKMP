package com.harish.photographyportfolio.home.presentation

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.harish.photographyportfolio.home.presentation.components.HomeHeader
import com.harish.photographyportfolio.home.presentation.components.HomePictureCarousel


@Composable
fun HomeSection(modifier: Modifier = Modifier, mainContentSize: Pair<Int, Int>?) {
    Box(
        modifier = Modifier
            .height(mainContentSize?.first?.dp!!)
            .width(mainContentSize.second.dp)
    ) {
        HomePictureCarousel(modifier, mainContentSize)
        HomeHeader()
    }
}