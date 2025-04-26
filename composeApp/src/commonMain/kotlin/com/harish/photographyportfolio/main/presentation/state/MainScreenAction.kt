package com.harish.photographyportfolio.main.presentation.state

import com.harish.photographyportfolio.core.DevicePlatform
import com.harish.photographyportfolio.core.ScreenSize

sealed interface MainScreenAction {


    data class SetDeviceDetails(
        val devicePlatform: DevicePlatform, val size: ScreenSize?
    ) : MainScreenAction

    data object GetHomeImageCarouselList : MainScreenAction

}