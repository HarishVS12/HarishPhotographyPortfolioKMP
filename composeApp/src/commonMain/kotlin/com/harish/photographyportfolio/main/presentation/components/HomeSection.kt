package com.harish.photographyportfolio.main.presentation.components

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.core.MutableTransitionState
import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.harish.photographyportfolio.core.presentation.getPrimaryFontFamily


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
        HomeContent(
            modifier = Modifier
                .align(Alignment.Center)
        )
    }
}

@Composable
fun HomeContent(modifier: Modifier = Modifier) {
    val state = remember {
        MutableTransitionState(false).apply {
            targetState = true
        }
    }
    AnimatedVisibility(
        visibleState = state,
        enter = fadeIn(
            animationSpec = tween(2000, delayMillis = 500)
        ),
        exit = fadeOut(
            animationSpec = tween(2000, delayMillis = 500)
        ),
        modifier = modifier
    )
    {
        Text(
            text = "Welcome..",
            color = Color.White,
            modifier = modifier,
            fontFamily = getPrimaryFontFamily(),
            fontStyle = FontStyle.Normal,
            fontWeight = FontWeight.Bold,
            fontSize = 200.sp
        )
    }
}