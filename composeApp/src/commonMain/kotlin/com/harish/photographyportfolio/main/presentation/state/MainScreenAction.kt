package com.harish.photographyportfolio.main.presentation.state

sealed interface MainScreenAction {


    data object SetDeviceDetails : MainScreenAction

    data object GetHomeImageCarouselList : MainScreenAction

}