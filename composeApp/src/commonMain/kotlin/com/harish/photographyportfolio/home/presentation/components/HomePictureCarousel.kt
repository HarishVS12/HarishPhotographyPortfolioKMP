package com.harish.photographyportfolio.home.presentation.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import harishphotographyportfolio.composeapp.generated.resources.Res
import harishphotographyportfolio.composeapp.generated.resources.himachal
import org.jetbrains.compose.resources.painterResource

@Composable
fun HomePictureCarousel(
    modifier: Modifier = Modifier,
    mainContentHeight: Int
) {
    Image(
        painter = painterResource(Res.drawable.himachal),
        contentDescription = "image",
        contentScale = ContentScale.FillBounds,
        modifier = Modifier
            .fillMaxWidth()
            .height(mainContentHeight.dp)
    )
}