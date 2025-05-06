package com.harish.photographyportfolio.main.domain

interface MainRepository {

    fun getCarouselImages(): CarouselImages

    suspend fun getMainResponse(): MainResponse?
}