package com.harish.photographyportfolio.main.data.mappers

import com.harish.photographyportfolio.main.data.dto.CarouselImageDTO
import com.harish.photographyportfolio.main.domain.CarouselImage


fun CarouselImageDTO.toCarouseImage(): CarouselImage {
    return CarouselImage(
        imageUrl = this.imageUrl
    )
}