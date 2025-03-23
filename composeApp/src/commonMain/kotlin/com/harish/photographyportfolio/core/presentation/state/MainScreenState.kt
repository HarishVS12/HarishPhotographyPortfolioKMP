package com.harish.photographyportfolio.core.presentation.state


data class MainScreenState(
    val homeItemViewportSize: Pair<Int, Int>? = Pair(0, 0),
    val isLoading: Boolean = true,
)