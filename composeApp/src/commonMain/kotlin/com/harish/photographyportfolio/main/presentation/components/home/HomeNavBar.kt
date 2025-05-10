package com.harish.photographyportfolio.main.presentation.components.home

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
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.harish.photographyportfolio.core.presentation.getHeaderFontFamily
import com.harish.photographyportfolio.core.presentation.getPrimaryFontFamily

@Composable
fun HomeNavBar(modifier: Modifier = Modifier, showNavTopBar: Boolean) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 16.dp, end = 16.dp)
    ) {
        Text(
            text = "You know who",
            style = MaterialTheme.typography.h4,
            modifier = Modifier
                .padding(start = 24.dp, top = 16.dp)
                .align(
                    if (showNavTopBar) {
                        Alignment.CenterStart
                    } else {
                        Alignment.Center
                    }
                ),
            fontFamily = getHeaderFontFamily(),
            fontStyle = FontStyle.Normal,
            fontWeight = FontWeight.Bold,
            color = Color.White
        )
        if (showNavTopBar) {
            Row(
                modifier = Modifier
                    .clip(RoundedCornerShape(12.dp))
                    .background(Color.White)
                    .wrapContentSize()
                    .align(Alignment.CenterEnd),
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
                            headerTitle = "Gallery"
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
}

@Composable
fun HomeHeaderItem(
    modifier: Modifier = Modifier,
    title: String,
    onHeaderClick: () -> Unit
) {
    Text(
        text = title,
        style = MaterialTheme.typography.subtitle2,
        modifier = Modifier
            .clickable { onHeaderClick() }
            .padding(horizontal = 16.dp, vertical = 16.dp),
        fontFamily = getPrimaryFontFamily(),
        fontStyle = FontStyle.Normal,
        fontWeight = FontWeight.Bold
    )
}