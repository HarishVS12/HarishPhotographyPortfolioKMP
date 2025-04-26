package com.harish.photographyportfolio.core

import android.content.res.Resources


actual fun getScreenSizeRatio(): ScreenSize? {
    return ScreenSize(
        width = Resources.getSystem().displayMetrics.widthPixels,
        height = Resources.getSystem().displayMetrics.heightPixels
    )
}

actual fun getDevicePlatform(): DevicePlatform = DevicePlatform.MOBILE