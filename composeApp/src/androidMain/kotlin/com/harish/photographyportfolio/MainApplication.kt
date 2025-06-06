package com.harish.photographyportfolio

import android.app.Application
import com.harish.photographyportfolio.core.di.initKoin
import org.koin.android.ext.koin.androidContext

class MainApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        initKoin {
            androidContext(this@MainApplication)
        }
    }

}