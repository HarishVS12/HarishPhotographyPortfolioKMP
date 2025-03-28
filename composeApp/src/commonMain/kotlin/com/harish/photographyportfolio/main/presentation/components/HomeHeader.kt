package com.harish.photographyportfolio.main.presentation.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun HomeHeader(modifier: Modifier = Modifier) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 16.dp)
    ) {
        Row(
            modifier = Modifier
                .clip(RoundedCornerShape(20.dp))
                .background(Color.White)
                .wrapContentSize()
                .align(Alignment.Center),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically,
        ) {
            repeat((1..4).count()) { index ->
                var headerTitle = ""
                var onHeaderClick = {}
                when (index) {
                    0 -> {
                        headerTitle = "Home"
                        onHeaderClick = {}
                    }

                    1 -> {
                        headerTitle = "About Me"
                        onHeaderClick = {}
                    }

                    2 -> {
                        headerTitle = "My Photos"
                        onHeaderClick = {}
                    }

                    3 -> {
                        headerTitle = "Contact"
                        onHeaderClick = {}
                    }
                }
                HomeHeaderItem(
                    title = headerTitle,
                    onHeaderClick = onHeaderClick
                )
            }
        }
    }
}

@Composable
fun HomeHeaderItem(
    modifier: Modifier = Modifier,
    title: String,
    onHeaderClick: () -> Unit
) {
    Text(
        text = title,
        style = MaterialTheme.typography.subtitle1,
        modifier = Modifier
            .clickable { onHeaderClick() }
            .padding(horizontal = 24.dp, vertical = 16.dp)
    )
}