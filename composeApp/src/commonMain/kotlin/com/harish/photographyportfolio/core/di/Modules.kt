package com.harish.photographyportfolio.core.di

import com.harish.photographyportfolio.main.data.repo.MainRepositoryImpl
import com.harish.photographyportfolio.main.domain.MainRepository
import com.harish.photographyportfolio.main.presentation.viewmodel.MainScreenViewModel
import org.koin.core.module.Module
import org.koin.core.module.dsl.viewModelOf
import org.koin.dsl.module

val viewModelModule: Module = module {

    //ViewModel
    viewModelOf(::MainScreenViewModel)

    //Repository
    single<MainRepository> { MainRepositoryImpl() }

}