package com.harish.photographyportfolio.main.data.dto


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class SectionHero(
    @SerialName("carousel_images")
    val carouselImages: List<CarouselImage>? = listOf(),
    @SerialName("header")
    val header: String? = ""
)