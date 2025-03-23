package com.harish.photographyportfolio.home.presentation

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import harishphotographyportfolio.composeapp.generated.resources.Res
import harishphotographyportfolio.composeapp.generated.resources.himachal
import org.jetbrains.compose.resources.painterResource

@Composable
fun HomeScreenRoot(modifier: Modifier = Modifier, mainContentHeight: Int?) {
    HomeScreen(modifier, mainContentHeight)
}

@Composable
fun HomeScreen(modifier: Modifier, mainContentHeight: Int?) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(mainContentHeight?.dp!!)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentHeight(),
            horizontalArrangement = Arrangement.SpaceEvenly,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "Home",
                fontSize = 20.sp
            )
            Text(
                text = "Home",
                fontSize = 20.sp
            )
            Text(
                text = "Home",
                fontSize = 20.sp
            )
            Text(
                text = "Home",
                fontSize = 20.sp
            )
            Text(
                text = "Home",
                fontSize = 20.sp
            )
        }
        Image(
            painter = painterResource(Res.drawable.himachal),
            contentDescription = "image",
            contentScale = ContentScale.FillBounds,
            modifier = Modifier
                .fillMaxWidth()
                .height(mainContentHeight.dp)
        )
    }
}