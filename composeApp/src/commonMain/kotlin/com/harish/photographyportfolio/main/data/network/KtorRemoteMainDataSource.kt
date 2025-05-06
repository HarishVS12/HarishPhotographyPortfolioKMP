package com.harish.photographyportfolio.main.data.network

import com.harish.photographyportfolio.main.data.dto.MainResponseDTO
import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.request.get

class KtorRemoteMainDataSource(
    val httpClient: HttpClient
) : RemoteMainDataSource {

    override suspend fun getMainResponse(): MainResponseDTO {
        return httpClient.get("https://run.mocky.io/v3/01504055-a274-4b64-861e-4918cc30efc9") {}
            .body<MainResponseDTO>()
    }
}