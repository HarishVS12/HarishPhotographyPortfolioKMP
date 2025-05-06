package com.harish.photographyportfolio.main.presentation.screen

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
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
}





