package com.harish.photographyportfolio.main.data.dto


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class MainResponseDTO(
    @SerialName("cards")
    val cards: List<MainSectionsDTO>? = listOf()
)

@Serializable
data class MainSectionsDTO(
    @SerialName("section_aboutme")
    val sectionAboutMe: SectionAboutMeDTO? = SectionAboutMeDTO(),
    @SerialName("section_contact")
    val sectionContact: SectionContactDTO? = SectionContactDTO(),
    @SerialName("section_gallery")
    val sectionGallery: SectionGalleryDTO? = SectionGalleryDTO(),
    @SerialName("section_hero")
    val sectionHero: SectionHeroDTO? = SectionHeroDTO(),
    @SerialName("type")
    val type: String? = ""
)

@Serializable
data class SectionAboutMeDTO(
    @SerialName("description")
    val description: String? = null,
    @SerialName("header")
    val header: String? = null,
    @SerialName("hero_image")
    val heroImage: String? = null
)

@Serializable
data class SectionContactDTO(
    @SerialName("header")
    val header: String? = null,
    @SerialName("media_list")
    val mediaList: List<ContactMediaDTO?>? = null
)

@Serializable
data class SectionGalleryDTO(
    @SerialName("carousel_images")
    val carouselImages: List<CarouselImageDTO?>? = null,
    @SerialName("header")
    val header: String? = null
)

@Serializable
data class SectionHeroDTO(
    @SerialName("carousel_images")
    val carouselImages: List<CarouselImageDTO>? = listOf(),
    @SerialName("header")
    val header: String? = ""
)


@Serializable
data class CarouselImageDTO(
    @SerialName("image_desc")
    val imageDesc: String? = null,
    @SerialName("image_url")
    val imageUrl: String? = null
)

@Serializable
data class ContactMediaDTO(
    @SerialName("image_url")
    val imageUrl: String? = null,
    @SerialName("media_url")
    val mediaUrl: String? = null
)