package com.harish.photographyportfolio.main.data.repo

import com.harish.photographyportfolio.main.data.dto.CarouselImageDTO
import com.harish.photographyportfolio.main.data.mappers.toCarouseImage
import com.harish.photographyportfolio.main.domain.CarouselImage
import com.harish.photographyportfolio.main.domain.MainRepository

class MainRepositoryImpl : MainRepository {

    override fun getCarouselImages(): CarouselImage {
        return CarouselImageDTO(
            imageUrl = listOf(
                "https://i.postimg.cc/bwS1k0h9/Whats-App-Image-2025-03-30-at-10-54-46-AM.jpg",
                "https://i.postimg.cc/PqmZFtNL/Whats-App-Image-2025-03-30-at-10-54-48-AM-1.jpg",
                "https://i.postimg.cc/G2KDdqFd/Whats-App-Image-2025-03-30-at-10-54-49-AM.jpg",
                "https://i.postimg.cc/prdFTzC8/Whats-App-Image-2025-03-30-at-10-54-49-AM-1.jpg",
                "https://i.postimg.cc/wTZmqtmy/Whats-App-Image-2025-03-30-at-10-54-50-AM.jpg",
                "https://i.postimg.cc/4yFhhy20/Whats-App-Image-2025-03-30-at-10-54-50-AM-1.jpg",
                "https://i.postimg.cc/rFK42GK2/Whats-App-Image-2025-03-30-at-10-54-50-AM-2.jpg",
                "https://i.postimg.cc/9Q9qrWdx/Whats-App-Image-2025-03-30-at-10-54-51-AM.jpg",
                "https://i.postimg.cc/Vs7thZsF/Whats-App-Image-2025-03-30-at-10-54-51-AM-1.jpg",
                "https://i.postimg.cc/k5dRSkw7/Whats-App-Image-2025-03-30-at-10-56-07-AM.jpg",
            )
        ).toCarouseImage()
    }

}