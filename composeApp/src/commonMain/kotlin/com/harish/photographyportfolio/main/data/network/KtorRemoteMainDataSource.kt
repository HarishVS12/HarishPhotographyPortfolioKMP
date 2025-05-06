package com.harish.photographyportfolio.main.data.network

import com.harish.photographyportfolio.main.data.dto.MainResponseDto
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class KtorRemoteMainDataSource() : RemoteMainDataSource {


    override fun getMainResponse(): Flow<MainResponseDto> {
        return flow { }
    }
}