package com.harish.photographyportfolio.main.data.dto


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class SectionAboutme(
    @SerialName("description")
    val description: String? = null,
    @SerialName("header")
    val header: String? = null,
    @SerialName("hero_image")
    val heroImage: String? = null
)