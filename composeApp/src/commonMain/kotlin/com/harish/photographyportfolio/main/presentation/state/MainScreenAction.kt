package com.harish.photographyportfolio.main.presentation.state

sealed interface MainScreenAction {


    data object SetHomeItemHeight : MainScreenAction

    data object GetHomeImageCarouselList : MainScreenAction

}