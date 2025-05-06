package com.harish.photographyportfolio.main.data.dto


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class MainResponseDto(
    @SerialName("cards")
    val cards: List<Card>? = listOf()
)