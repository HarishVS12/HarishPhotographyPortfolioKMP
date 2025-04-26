package com.harish.photographyportfolio.main.presentation.screen

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.harish.photographyportfolio.core.ScreenSize
import com.harish.photographyportfolio.main.presentation.components.about.AboutSection
import com.harish.photographyportfolio.main.presentation.components.gallery.GallerySection
import com.harish.photographyportfolio.main.presentation.components.home.HomeSection


@Composable
fun MainScreenWeb(
    modifier: Modifier,
    mainContentSize: ScreenSize?,
    homeCarouselList: List<String>
) {
    Box(modifier = Modifier.fillMaxSize()) {
        val itemParentModifier = Modifier
            .height(mainContentSize?.height?.dp ?: 0.dp)
            .width(mainContentSize?.width?.dp ?: 0.dp)

        LazyColumn(modifier = Modifier.fillMaxSize()) {
            item {
                HomeSection(
                    itemParentModifier,
                    homeCarouselList,
                    170,
                    true
                )
            }
            item {
                AboutSection(
                    itemParentModifier,
                )
            }
            item {
                GallerySection(
                    itemParentModifier,
                )
            }
        }
    }
}

