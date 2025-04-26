package com.harish.photographyportfolio.main.presentation.components.about

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.TextUnitType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil3.compose.AsyncImage
import com.harish.photographyportfolio.core.presentation.getPrimaryFontFamily
import harishphotographyportfolio.composeapp.generated.resources.Res
import harishphotographyportfolio.composeapp.generated.resources.dummy_text
import org.jetbrains.compose.resources.stringResource

@Composable
fun AboutSectionMobile(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .padding(top = 16.dp, start = 16.dp, end = 16.dp),
    ) {
        Text(
            text = "Through The Art .",
            modifier = Modifier.align(Alignment.CenterHorizontally),
            fontFamily = getPrimaryFontFamily(),
            fontStyle = FontStyle.Normal,
            fontWeight = FontWeight.Normal,
            fontSize = 50.sp,
            maxLines = 1,
            overflow = TextOverflow.Ellipsis,
            letterSpacing = TextUnit(-8f, TextUnitType.Sp)
        )
        Spacer(modifier = Modifier.height(24.dp))
        Column(
            modifier = Modifier.fillMaxWidth().wrapContentHeight(),
        ) {
            AsyncImage(
                model = "https://i.postimg.cc/Y9MF5Jmd/Whats-App-Image-2025-03-30-at-10-54-48-AM.jpg",
                contentDescription = "image",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(480.dp)
                    .clip(RoundedCornerShape(8.dp))
            )
            Spacer(modifier = Modifier.height(16.dp))
            Text(
                text = stringResource(Res.string.dummy_text),
                modifier = Modifier,
                fontFamily = getPrimaryFontFamily(),
                fontStyle = FontStyle.Normal,
                fontWeight = FontWeight.Normal,
                fontSize = 16.sp,
                letterSpacing = TextUnit(-0.5f, TextUnitType.Sp),
                textAlign = TextAlign.Start

            )
        }
    }
}