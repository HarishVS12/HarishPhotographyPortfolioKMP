package com.harish.photographyportfolio.main.data.repo

import com.harish.photographyportfolio.core.util.getImageList
import com.harish.photographyportfolio.main.data.dto.CarouselImagesDTO
import com.harish.photographyportfolio.main.data.mappers.toCarouselImages
import com.harish.photographyportfolio.main.data.mappers.toMainResponse
import com.harish.photographyportfolio.main.data.network.RemoteMainDataSource
import com.harish.photographyportfolio.main.domain.CarouselImages
import com.harish.photographyportfolio.main.domain.MainRepository
import com.harish.photographyportfolio.main.domain.MainResponse

class MainRepositoryImpl(
    private val ktorRemoteMainDataSource: RemoteMainDataSource
) : MainRepository {

    override fun getCarouselImages(): CarouselImages {
        return CarouselImagesDTO(
            imageUrl = getImageList()
        ).toCarouselImages()
    }

    override suspend fun getMainResponse(): MainResponse? {
        val ktorResponse = ktorRemoteMainDataSource?.getMainResponse()
        val mainRepository = ktorResponse?.toMainResponse()
        return ktorResponse?.toMainResponse()
    }

}