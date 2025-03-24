package com.harish.photographyportfolio.main.presentation.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.sp

@Composable
fun HomeHeader(modifier: Modifier = Modifier) {
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
}