package com.harish.photographyportfolio.main.data.dto


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class SectionGallery(
    @SerialName("carousel_images")
    val carouselImages: List<CarouselImage?>? = null,
    @SerialName("header")
    val header: String? = null
)