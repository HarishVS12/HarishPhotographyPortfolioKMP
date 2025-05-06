package com.harish.photographyportfolio.main.data.dto


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Media(
    @SerialName("image_url")
    val imageUrl: String? = null,
    @SerialName("media_url")
    val mediaUrl: String? = null
)