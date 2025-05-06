package com.harish.photographyportfolio.main.data.dto


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class SectionContact(
    @SerialName("header")
    val header: String? = null,
    @SerialName("media_list")
    val mediaList: List<Media?>? = null
)