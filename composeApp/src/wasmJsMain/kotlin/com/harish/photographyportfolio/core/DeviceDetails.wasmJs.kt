package com.harish.photographyportfolio.core

import kotlinx.browser.window

actual fun getScreenSizeRatio(): ScreenSize? {
    return ScreenSize(window.innerWidth, window.innerHeight)
}

actual fun getDevicePlatform(): DevicePlatform {
    return if (window.innerWidth < 768) {
        DevicePlatform.MOBILE_WEB
    } else {
        DevicePlatform.WEB
    }
}

actual fun getDevicePlatformOnResize(invokeDevicePlatform: (DevicePlatform, ScreenSize?) -> Unit) {
    window.addEventListener("resize") {
        invokeDevicePlatform(
            getDevicePlatform(), getScreenSizeRatio()
        )
    }
}