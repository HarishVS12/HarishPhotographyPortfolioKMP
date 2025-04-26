package com.harish.photographyportfolio.core

import kotlinx.browser.window

actual fun getScreenSizeRatio(): ScreenSize? {
    return ScreenSize(window.innerWidth, window.innerHeight)
}

actual fun getDevicePlatform(): DevicePlatform {
    return if (window.innerHeight < 800) {
        DevicePlatform.MOBILE_WEB
    } else {
        DevicePlatform.WEB
    }
}