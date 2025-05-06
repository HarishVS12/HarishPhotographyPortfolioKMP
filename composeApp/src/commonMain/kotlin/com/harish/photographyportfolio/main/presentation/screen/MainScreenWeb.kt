package com.harish.photographyportfolio.main.presentation.screen

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import com.harish.photographyportfolio.core.ScreenSize
import com.harish.photographyportfolio.main.domain.MainSections
import com.harish.photographyportfolio.main.presentation.components.MadeWithLoveSection
import com.harish.photographyportfolio.main.presentation.components.about.AboutSection
import com.harish.photographyportfolio.main.presentation.components.contact.ContactSection
import com.harish.photographyportfolio.main.presentation.components.gallery.GallerySection
import com.harish.photographyportfolio.main.presentation.components.home.HomeSection


@Composable
fun MainScreenWeb(
    modifier: Modifier,
    mainContentSize: ScreenSize?,
    homeCarouselList: List<String>,
    mainSection: List<MainSections>
) {
    Box(modifier = Modifier.fillMaxSize()) {
        val itemParentModifier = Modifier
            .height(mainContentSize?.height?.dp ?: 0.dp)
            .width(mainContentSize?.width?.dp ?: 0.dp)

        LazyColumn(modifier = Modifier.fillMaxSize()) {

            itemsIndexed(mainSection) { index, item ->
                when (item.type) {
                    "section_hero" -> {
                        HomeSection(
                            modifier = itemParentModifier,
                            homeCarouselList = mainSection[index].sectionHero?.carouselImages,
                            homeHeaderTextSize = 170,
                            showNavTopBar = true
                        )

                    }

                    "section_gallery" -> {
                        GallerySection(
                            modifier = itemParentModifier,
                            headerTextSize = 50,
                            galleryResponse = mainSection[index].sectionGallery,
                            imageDimensions = Modifier
                                .padding(start = 24.dp)
                                .wrapContentSize()
                                .clip(RoundedCornerShape(12.dp))
                        )
                    }

                    "section_aboutme" -> {
                        AboutSection(
                            modifier = modifier
                                .fillMaxWidth(),
                            aboutMeResponse = mainSection[index].sectionAboutMe
                        )
                    }

                    "section_contact" -> {
                        ContactSection(
                            headerTextSize = 110,
                            isSpacingRequired = true,
                            contactResponse = mainSection[index].sectionContact
                        )
                    }

                }
            }
            if (mainSection.isNotEmpty()) {
                item {
                    MadeWithLoveSection(headerTextSize = 20)
                }
            }
        }
    }
}

