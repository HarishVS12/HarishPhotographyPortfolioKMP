package com.harish.photographyportfolio.main.data.repo

import com.harish.photographyportfolio.main.domain.MainRepository

class MainRepositoryImpl : MainRepository {

    override fun getCarouselImages(): List<String> {
        return listOf(
            "https://i.postimg.cc/gkBLRwWy/1727775083170.jpg"
        )
    }

}