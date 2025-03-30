package com.harish.photographyportfolio.main.presentation.components.gallery

import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.snapping.SnapPosition
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.TextUnitType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil3.compose.AsyncImage
import com.harish.photographyportfolio.core.presentation.getHeaderFontFamily
import com.harish.photographyportfolio.core.presentation.getPrimaryFontFamily
import com.harish.photographyportfolio.core.util.getImageList
import com.harish.photographyportfolio.core.util.toColor
import harishphotographyportfolio.composeapp.generated.resources.Res
import harishphotographyportfolio.composeapp.generated.resources.dummy_text
import org.jetbrains.compose.resources.stringResource

@Composable
fun GallerySection(
    modifier: Modifier,
    imageList: List<String> = getImageList()
) {
    Column(
        modifier = modifier
            .background("#ECF0E1".toColor())
            .padding(top = 16.dp, start = 16.dp, end = 16.dp),
    ) {
        Spacer(modifier = Modifier.height(24.dp))
        Text(
            text = "Every photograph is a fragment of time, a moment captured before it fades. Through my lens, I invite you to see the world as I do—one frame at a time",
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.CenterHorizontally)
                .padding(horizontal = 40.dp),
            fontFamily = getHeaderFontFamily(),
            fontStyle = FontStyle.Normal,
            fontWeight = FontWeight.Normal,
            fontSize = 50.sp,
            lineHeight = 50.sp
        )
        Spacer(modifier = Modifier.height(68.dp))
        LazyRow {
            items(imageList, key = {
                it
            }) { image ->
                Column {
                    AsyncImage(
                        model = image,
                        contentDescription = "image",
                        modifier = Modifier
                            .padding(start = 24.dp)
                            .wrapContentSize()
                            .clip(RoundedCornerShape(12.dp))
                    )
                    Text(
                        text = "Image desc here",
                        modifier = Modifier
                            .align(Alignment.CenterHorizontally)
                            .padding(vertical = 16.dp, horizontal = 16.dp),
                        fontFamily = getPrimaryFontFamily(),
                        fontStyle = FontStyle.Normal,
                        fontWeight = FontWeight.Medium,
                        fontSize = 20.sp,
                    )
                }
            }
        }
    }
}