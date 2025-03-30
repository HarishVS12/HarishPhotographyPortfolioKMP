package com.harish.photographyportfolio.main.data.repo

import com.harish.photographyportfolio.core.util.getImageList
import com.harish.photographyportfolio.main.data.dto.CarouselImageDTO
import com.harish.photographyportfolio.main.data.mappers.toCarouseImage
import com.harish.photographyportfolio.main.domain.CarouselImage
import com.harish.photographyportfolio.main.domain.MainRepository

class MainRepositoryImpl : MainRepository {

    override fun getCarouselImages(): CarouselImage {
        return CarouselImageDTO(
            imageUrl = getImageList()
        ).toCarouseImage()
    }

}