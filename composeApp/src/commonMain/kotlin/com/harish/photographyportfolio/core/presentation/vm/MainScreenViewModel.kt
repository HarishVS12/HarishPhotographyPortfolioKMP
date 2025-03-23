package com.harish.photographyportfolio.core.presentation.vm

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.harish.photographyportfolio.core.getViewPortHeight
import com.harish.photographyportfolio.core.presentation.state.MainScreenAction
import com.harish.photographyportfolio.core.presentation.state.MainScreenState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.onStart
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.flow.update


class MainScreenViewModel : ViewModel() {

    private var _mainScreenState: MutableStateFlow<MainScreenState> =
        MutableStateFlow(MainScreenState())
    val mainScreenState = _mainScreenState
        .onStart {
            onAction(
                MainScreenAction.SetHomeItemHeight
            )
        }
        .stateIn(
            viewModelScope,
            SharingStarted.WhileSubscribed(5000),
            MainScreenState()
        )


    fun onAction(action: MainScreenAction) {
        when (action) {
            MainScreenAction.SetHomeItemHeight -> {
                val height = getViewPortHeight()
                _mainScreenState.update {
                    it.copy(
                        homeItemHeight = height
                    )
                }
            }


        }
    }


}