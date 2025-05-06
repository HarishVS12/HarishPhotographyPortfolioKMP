package com.harish.photographyportfolio.main.data.dto

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Serializable
data class CarouselImage(
    @SerialName("image_desc")
    val imageDesc: String? = null,
    @SerialName("image_url")
    val imageUrl: String? = null
)