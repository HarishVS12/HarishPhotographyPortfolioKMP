package com.harish.photographyportfolio.main.data.network

import com.harish.photographyportfolio.main.data.dto.MainResponseDTO
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class KtorRemoteMainDataSource() : RemoteMainDataSource {

    override fun getMainResponse(): Flow<MainResponseDTO> {
        return flow { }
    }
}