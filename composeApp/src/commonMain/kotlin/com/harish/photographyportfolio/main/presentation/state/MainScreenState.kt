package com.harish.photographyportfolio.main.presentation.state

import com.harish.photographyportfolio.core.DevicePlatform
import com.harish.photographyportfolio.core.ScreenSize


data class MainScreenState(
    val devicePlatform: DevicePlatform = DevicePlatform.MOBILE,
    val homeItemViewportSize: ScreenSize? = null,
    val homeCarouselList: List<String> = emptyList(),
    val isLoading: Boolean = true,
)