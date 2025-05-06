package com.harish.photographyportfolio.main.data.network

import com.harish.photographyportfolio.main.data.dto.MainResponseDto
import kotlinx.coroutines.flow.Flow

interface RemoteMainDataSource {

    fun getMainResponse(): Flow<MainResponseDto>

}