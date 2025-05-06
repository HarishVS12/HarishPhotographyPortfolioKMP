package com.harish.photographyportfolio.main.presentation.screen

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.harish.photographyportfolio.core.DevicePlatform
import com.harish.photographyportfolio.core.getDevicePlatformOnResize
import com.harish.photographyportfolio.main.presentation.state.MainScreenAction
import com.harish.photographyportfolio.main.presentation.viewmodel.MainScreenViewModel
import org.koin.compose.viewmodel.koinViewModel

@Composable
fun MainScreenRoot(
    modifier: Modifier = Modifier,
    mainScreenViewModel: MainScreenViewModel = koinViewModel(),
) {
    val mainScreenState by mainScreenViewModel.mainScreenState.collectAsStateWithLifecycle()

    getDevicePlatformOnResize { devicePlatform, screenSize ->
        mainScreenViewModel.onAction(
            MainScreenAction.SetDeviceDetails(
                devicePlatform,
                screenSize
            )
        )
    }
    if (!mainScreenState.isLoading) {
        if (mainScreenState.devicePlatform == DevicePlatform.WEB) {
            MainScreenWeb(
                modifier,
                mainScreenState.homeItemViewportSize,
                mainScreenState.homeCarouselList,
                mainScreenState.mainSection
            )
        } else {
            MainScreenMobile(
                modifier,
                mainScreenState.homeItemViewportSize,
                mainScreenState.homeCarouselList,
                mainScreenState.mainSection
            )
        }
    } else {
        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {
            CircularProgressIndicator()
        }
    }

}





