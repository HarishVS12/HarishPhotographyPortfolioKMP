package com.harish.photographyportfolio.main.presentation.screen

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.harish.photographyportfolio.core.ScreenSize
import com.harish.photographyportfolio.main.presentation.components.about.AboutSection
import com.harish.photographyportfolio.main.presentation.components.gallery.GallerySection
import com.harish.photographyportfolio.main.presentation.components.home.HomeSection


@Composable
fun MainScreenMobile(
    modifier: Modifier,
    mainContentSize: ScreenSize?,
    homeCarouselList: List<String>
) {
    Box(modifier = Modifier.fillMaxSize()) {
        LazyColumn(modifier = Modifier.fillMaxSize()) {
            item {
                HomeSection(
                    modifier
                        .fillMaxWidth()
                        .height(200.dp),
                    homeCarouselList,
                    50,
                    false
                )
            }
            item {
                AboutSection(
                    modifier
                        .fillMaxWidth()
                )
            }
            item {
                GallerySection(
                    modifier
                        .fillMaxWidth(),
                )
            }
        }
    }
}
