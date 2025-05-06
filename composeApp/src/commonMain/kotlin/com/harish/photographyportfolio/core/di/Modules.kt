package com.harish.photographyportfolio.core.di

import com.harish.photographyportfolio.core.data.HttpClientFactory
import com.harish.photographyportfolio.main.data.network.KtorRemoteMainDataSource
import com.harish.photographyportfolio.main.data.network.RemoteMainDataSource
import com.harish.photographyportfolio.main.data.repo.MainRepositoryImpl
import com.harish.photographyportfolio.main.domain.MainRepository
import com.harish.photographyportfolio.main.presentation.viewmodel.MainScreenViewModel
import org.koin.core.module.Module
import org.koin.core.module.dsl.singleOf
import org.koin.core.module.dsl.viewModelOf
import org.koin.dsl.bind
import org.koin.dsl.module

expect val platformModule: Module

val sharedModule: Module = module {

    //Ktor
    single { HttpClientFactory.create(get()) }
    singleOf(::KtorRemoteMainDataSource).bind<RemoteMainDataSource>()

    //ViewModel
    viewModelOf(::MainScreenViewModel)

    //Repository
    single<MainRepository> { MainRepositoryImpl(get()) }

}