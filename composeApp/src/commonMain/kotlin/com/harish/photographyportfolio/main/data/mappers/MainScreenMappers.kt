package com.harish.photographyportfolio.main.data.mappers

import com.harish.photographyportfolio.main.data.dto.CarouselImageDTO
import com.harish.photographyportfolio.main.data.dto.CarouselImagesDTO
import com.harish.photographyportfolio.main.data.dto.ContactMediaDTO
import com.harish.photographyportfolio.main.data.dto.MainResponseDTO
import com.harish.photographyportfolio.main.data.dto.MainSectionsDTO
import com.harish.photographyportfolio.main.data.dto.SectionAboutMeDTO
import com.harish.photographyportfolio.main.data.dto.SectionContactDTO
import com.harish.photographyportfolio.main.data.dto.SectionGalleryDTO
import com.harish.photographyportfolio.main.data.dto.SectionHeroDTO
import com.harish.photographyportfolio.main.domain.CarouselImage
import com.harish.photographyportfolio.main.domain.CarouselImages
import com.harish.photographyportfolio.main.domain.ContactMedia
import com.harish.photographyportfolio.main.domain.MainResponse
import com.harish.photographyportfolio.main.domain.MainSections
import com.harish.photographyportfolio.main.domain.SectionAboutMe
import com.harish.photographyportfolio.main.domain.SectionContact
import com.harish.photographyportfolio.main.domain.SectionGallery
import com.harish.photographyportfolio.main.domain.SectionHero


fun CarouselImagesDTO.toCarouselImages(): CarouselImages {
    return CarouselImages(
        imageUrl = this.imageUrl
    )
}

fun MainResponseDTO.toMainResponse(): MainResponse {
    return MainResponse(
        cards = this.cards?.map { it.toMainSections() }
    )
}

fun MainSectionsDTO.toMainSections(): MainSections {
    return MainSections(
        sectionAboutMe = this.sectionAboutMe?.toSectionAboutMe(),
        sectionContact = this.sectionContact?.toSectionContact(),
        sectionGallery = this.sectionGallery?.toSectionGallery(),
        sectionHero = this.sectionHero?.toSectionHero(),
        type = this.type
    )
}

fun SectionAboutMeDTO.toSectionAboutMe(): SectionAboutMe {
    return SectionAboutMe(
        description = this.description,
        header = this.header,
        heroImage = this.heroImage
    )
}

fun SectionContactDTO.toSectionContact(): SectionContact {
    return SectionContact(
        header = this.header,
        mediaList = this.mediaList?.map { it?.toContactMedia() }
    )
}

fun ContactMediaDTO.toContactMedia(): ContactMedia {
    return ContactMedia(
        imageUrl = this.imageUrl,
        mediaUrl = this.mediaUrl
    )
}

fun SectionGalleryDTO.toSectionGallery(): SectionGallery {
    return SectionGallery(
        carouselImages = this.carouselImages?.map { it?.toCarouselImage() },
        header = this.header
    )
}

fun CarouselImageDTO.toCarouselImage(): CarouselImage {
    return CarouselImage(
        imageDesc = this.imageDesc,
        imageUrl = this.imageUrl
    )
}

fun SectionHeroDTO.toSectionHero(): SectionHero {
    return SectionHero(
        carouselImages = this.carouselImages?.map { it.toCarouselImage() },
        header = this.header
    )
}