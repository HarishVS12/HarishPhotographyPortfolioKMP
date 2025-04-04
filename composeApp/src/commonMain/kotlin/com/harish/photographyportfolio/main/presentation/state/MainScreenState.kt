package com.harish.photographyportfolio.main.presentation.state


data class MainScreenState(
    val homeItemViewportSize: Pair<Int, Int>? = Pair(0, 0),
    val homeCarouselList: List<String> = emptyList(),
    val isLoading: Boolean = true,
)