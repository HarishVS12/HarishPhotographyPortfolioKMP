package com.harish.photographyportfolio.main.presentation.screen

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import com.harish.photographyportfolio.core.ScreenSize
import com.harish.photographyportfolio.main.presentation.components.MadeWithLoveSection
import com.harish.photographyportfolio.main.presentation.components.about.AboutSectionMobile
import com.harish.photographyportfolio.main.presentation.components.contact.ContactSection
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
                    modifier = modifier
                        .fillParentMaxWidth()
                        .height(600.dp),
                    homeCarouselList = homeCarouselList,
                    homeHeaderTextSize = 60,
                    showNavTopBar = false
                )
            }
            item {
                AboutSectionMobile(
                    modifier = modifier
                        .fillMaxWidth()
                )
            }
            item {
                GallerySection(
                    modifier = modifier
                        .fillMaxWidth(),
                    headerTextSize = 36,
                    imageDimensions = Modifier
                        .fillParentMaxWidth(0.96f)
                        .padding(horizontal = 8.dp)
                        .clip(RoundedCornerShape(12.dp))
                )
            }
            item {
                ContactSection(headerTextSize = 50, isSpacingRequired = false)
            }

            item {
                MadeWithLoveSection(headerTextSize = 14)
            }
        }
    }
}
