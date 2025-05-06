package com.harish.photographyportfolio.main.domain

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


data class MainResponse(
    val cards: List<MainSections>? = listOf()
)

data class MainSections(
    val sectionAboutMe: SectionAboutMe? = SectionAboutMe(),
    val sectionContact: SectionContact? = SectionContact(),
    val sectionGallery: SectionGallery? = SectionGallery(),
    val sectionHero: SectionHero? = SectionHero(),
    val type: String? = ""
)

data class SectionAboutMe(
    val description: String? = null,
    val header: String? = null,
    val heroImage: String? = null
)

data class SectionContact(
    val header: String? = null,
    val mediaList: List<ContactMedia?>? = null
)

data class SectionGallery(
    val carouselImages: List<CarouselImage?>? = null,
    val header: String? = null
)

data class SectionHero(
    val carouselImages: List<CarouselImage>? = listOf(),
    val header: String? = ""
)


data class CarouselImage(
    val imageDesc: String? = null,
    val imageUrl: String? = null
)

data class ContactMedia(
    val imageUrl: String? = null,
    val mediaUrl: String? = null
)