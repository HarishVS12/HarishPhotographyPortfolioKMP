package com.harish.photographyportfolio.main.data.network

import com.harish.photographyportfolio.main.data.dto.MainResponseDTO
import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.request.get

class KtorRemoteMainDataSource(
    val httpClient: HttpClient
) : RemoteMainDataSource {

    override suspend fun getMainResponse(): MainResponseDTO {
        return httpClient.get("https://harishphotofoliobackend.onrender.com/api/main") {}
            .body<MainResponseDTO>()
    }
}