package com.harish.photographyportfolio.main.data.dto


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class MainResponseDTO(
    @SerialName("cards")
    val cards: List<MainSections>? = listOf()
)

@Serializable
data class MainSections(
    @SerialName("section_aboutme")
    val sectionAboutMe: SectionAboutMe? = SectionAboutMe(),
    @SerialName("section_contact")
    val sectionContact: SectionContact? = SectionContact(),
    @SerialName("section_gallery")
    val sectionGallery: SectionGallery? = SectionGallery(),
    @SerialName("section_hero")
    val sectionHero: SectionHero? = SectionHero(),
    @SerialName("type")
    val type: String? = ""
)

@Serializable
data class SectionAboutMe(
    @SerialName("description")
    val description: String? = null,
    @SerialName("header")
    val header: String? = null,
    @SerialName("hero_image")
    val heroImage: String? = null
)

@Serializable
data class SectionContact(
    @SerialName("header")
    val header: String? = null,
    @SerialName("media_list")
    val mediaList: List<ContactMedia?>? = null
)

@Serializable
data class SectionGallery(
    @SerialName("carousel_images")
    val carouselImages: List<CarouselImage?>? = null,
    @SerialName("header")
    val header: String? = null
)

@Serializable
data class SectionHero(
    @SerialName("carousel_images")
    val carouselImages: List<CarouselImage>? = listOf(),
    @SerialName("header")
    val header: String? = ""
)


@Serializable
data class CarouselImage(
    @SerialName("image_desc")
    val imageDesc: String? = null,
    @SerialName("image_url")
    val imageUrl: String? = null
)

@Serializable
data class ContactMedia(
    @SerialName("image_url")
    val imageUrl: String? = null,
    @SerialName("media_url")
    val mediaUrl: String? = null
)