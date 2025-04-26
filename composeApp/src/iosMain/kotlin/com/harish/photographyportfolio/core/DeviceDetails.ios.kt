package com.harish.photographyportfolio.core

import kotlinx.cinterop.ExperimentalForeignApi
import kotlinx.cinterop.useContents
import platform.UIKit.UIScreen
import platform.posix.winsize

@OptIn(ExperimentalForeignApi::class)
actual fun getScreenSizeRatio(): ScreenSize? {
    val screenBounds = UIScreen.mainScreen().bounds
    return ScreenSize(
        width = screenBounds.useContents { size.width }.toInt(),
        height = screenBounds.useContents { size.height }.toInt()
    )
}

actual fun getDevicePlatform(): DevicePlatform = DevicePlatform.MOBILE

actual fun getDevicePlatformOnResize(invokeDevicePlatform: (DevicePlatform, ScreenSize?) -> Unit) {
    invokeDevicePlatform(DevicePlatform.MOBILE, getScreenSizeRatio())
}