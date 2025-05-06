package com.harish.photographyportfolio.main.data.network

import com.harish.photographyportfolio.main.data.dto.MainResponseDTO

interface RemoteMainDataSource {

    suspend fun getMainResponse(): MainResponseDTO?

}