package com.harish.photographyportfolio.main.domain

import com.harish.photographyportfolio.main.data.dto.MainResponseDTO

interface MainRepository {

    fun getCarouselImages(): CarouselImage

    suspend fun getMainResponse(): MainResponseDTO?
}