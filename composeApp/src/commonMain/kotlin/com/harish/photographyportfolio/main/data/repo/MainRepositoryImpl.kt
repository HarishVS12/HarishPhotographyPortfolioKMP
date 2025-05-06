package com.harish.photographyportfolio.main.data.repo

import com.harish.photographyportfolio.core.util.getImageList
import com.harish.photographyportfolio.main.data.dto.CarouselImageDTO
import com.harish.photographyportfolio.main.data.dto.MainResponseDTO
import com.harish.photographyportfolio.main.data.mappers.toCarouseImage
import com.harish.photographyportfolio.main.data.network.RemoteMainDataSource
import com.harish.photographyportfolio.main.domain.CarouselImage
import com.harish.photographyportfolio.main.domain.MainRepository

class MainRepositoryImpl(
    val ktorRemoteMainDataSource: RemoteMainDataSource
) : MainRepository {

    override fun getCarouselImages(): CarouselImage {
        return CarouselImageDTO(
            imageUrl = getImageList()
        ).toCarouseImage()
    }

    override suspend fun getMainResponse(): MainResponseDTO? {
        return ktorRemoteMainDataSource.getMainResponse()
    }

}