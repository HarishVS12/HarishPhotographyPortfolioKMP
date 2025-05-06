package com.harish.photographyportfolio.main.presentation.components.gallery

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil3.compose.SubcomposeAsyncImage
import com.harish.photographyportfolio.core.presentation.getHeaderFontFamily
import com.harish.photographyportfolio.core.presentation.getPrimaryFontFamily
import com.harish.photographyportfolio.core.util.getImageList
import com.harish.photographyportfolio.core.util.toColor
import com.harish.photographyportfolio.main.domain.SectionGallery
import harishphotographyportfolio.composeapp.generated.resources.Res
import harishphotographyportfolio.composeapp.generated.resources.about_me_header
import org.jetbrains.compose.resources.stringResource

@Composable
fun GallerySection(
    modifier: Modifier,
    headerTextSize: Int,
    imageDimensions: Modifier,
    galleryResponse: SectionGallery?
) {
    Column(
        modifier = modifier
            .background("#ECF0E1".toColor())
    ) {
        Spacer(modifier = Modifier.height(24.dp))
        Text(
            text = stringResource(Res.string.about_me_header),
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.CenterHorizontally)
                .padding(horizontal = 40.dp),
            fontFamily = getHeaderFontFamily(),
            fontStyle = FontStyle.Normal,
            fontWeight = FontWeight.Normal,
            fontSize = headerTextSize.sp,
            lineHeight = headerTextSize.sp
        )
        Spacer(modifier = Modifier.height(68.dp))
        LazyRow {
            items(galleryResponse?.carouselImages ?: emptyList(), key = {
                it?.imageUrl ?: ""
            }) { image ->
                Column {
                    SubcomposeAsyncImage(
                        model = image?.imageUrl,
                        contentDescription = "image",
                        modifier = imageDimensions
                    )
                    Text(
                        text = image?.imageDesc ?: "",
                        modifier = Modifier
                            .align(Alignment.CenterHorizontally)
                            .padding(vertical = 16.dp),
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