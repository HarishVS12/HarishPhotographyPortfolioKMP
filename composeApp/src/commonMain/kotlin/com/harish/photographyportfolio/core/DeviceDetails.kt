package com.harish.photographyportfolio.core


expect fun getScreenSizeRatio(): ScreenSize?

expect fun getDevicePlatform(): DevicePlatform

expect fun getDevicePlatformOnResize(invokeDevicePlatform: (DevicePlatform, ScreenSize?) -> Unit)

data class ScreenSize(val width: Int, val height: Int)

enum class DevicePlatform {
    WEB, MOBILE_WEB, MOBILE
}