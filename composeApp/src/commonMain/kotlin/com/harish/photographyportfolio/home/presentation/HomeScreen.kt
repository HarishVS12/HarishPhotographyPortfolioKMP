package com.harish.photographyportfolio.home.presentation

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.sp

@Composable
fun HomeScreenRoot(modifier: Modifier = Modifier) {
    HomeScreen(modifier)
}

@Composable
fun HomeScreen(modifier: Modifier) {
    Text(
        text = "HOME SCREEN HERE DOOODODODODO!",
        fontSize = 40.sp,
        color = Color.Black
    )
}
