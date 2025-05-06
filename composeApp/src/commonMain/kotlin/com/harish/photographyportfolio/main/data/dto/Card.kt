package com.harish.photographyportfolio.main.data.dto

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Serializable
data class Card(
    @SerialName("section_aboutme")
    val sectionAboutme: SectionAboutme? = SectionAboutme(),
    @SerialName("section_contact")
    val sectionContact: SectionContact? = SectionContact(),
    @SerialName("section_gallery")
    val sectionGallery: SectionGallery? = SectionGallery(),
    @SerialName("section_hero")
    val sectionHero: SectionHero? = SectionHero(),
    @SerialName("type")
    val type: String? = ""
)