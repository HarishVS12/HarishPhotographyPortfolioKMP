package com.harish.photographyportfolio.main.presentation.components.home

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
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.harish.photographyportfolio.core.presentation.getPrimaryFontFamily
import com.harish.photographyportfolio.core.util.toColor


@Composable
fun HomeSection(
    modifier: Modifier = Modifier,
    homeCarouselList: List<String>
) {
    Box(
        modifier = Modifier
    ) {
        HomePictureCarousel(modifier, homeCarouselList)
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
            modifier = modifier
                .alpha(0.8f),
            fontFamily = getPrimaryFontFamily(),
            fontStyle = FontStyle.Normal,
            fontWeight = FontWeight.Bold,
            fontSize = 170.sp,
            style = TextStyle(
                brush = Brush.horizontalGradient(
                    listOf(
                        "#ff9a9e".toColor(),
                        "#fccb90".toColor(),
                        Color.Transparent
                    )
                )
            )
        )
    }
}