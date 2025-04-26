package com.harish.photographyportfolio.main.presentation.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.harish.photographyportfolio.core.getDevicePlatform
import com.harish.photographyportfolio.core.getScreenSizeRatio
import com.harish.photographyportfolio.main.domain.MainRepository
import com.harish.photographyportfolio.main.presentation.state.MainScreenAction
import com.harish.photographyportfolio.main.presentation.state.MainScreenState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.onStart
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.flow.update


class MainScreenViewModel(
    val mainRepository: MainRepository
) : ViewModel() {

    private var _mainScreenState: MutableStateFlow<MainScreenState> =
        MutableStateFlow(MainScreenState())
    val mainScreenState = _mainScreenState
        .onStart {
            onAction(
                MainScreenAction.SetDeviceDetails
            )
            onAction(
                MainScreenAction.GetHomeImageCarouselList
            )
        }
        .stateIn(
            viewModelScope,
            SharingStarted.WhileSubscribed(5000),
            MainScreenState()
        )


    fun onAction(action: MainScreenAction) {
        when (action) {
            MainScreenAction.SetDeviceDetails -> {
                val size = getScreenSizeRatio()
                val devicePlatform = getDevicePlatform()

                _mainScreenState.update {
                    it.copy(
                        homeItemViewportSize = size,
                        devicePlatform = devicePlatform
                    )
                }
            }

            MainScreenAction.GetHomeImageCarouselList -> {
                val imageList = mainRepository.getCarouselImages()
                _mainScreenState.update {
                    it.copy(
                        homeCarouselList = imageList.imageUrl
                    )
                }
            }
        }
    }


}