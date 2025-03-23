package com.harish.photographyportfolio.core.di

import com.harish.photographyportfolio.core.presentation.vm.MainScreenViewModel
import org.koin.core.module.Module
import org.koin.core.module.dsl.viewModelOf
import org.koin.dsl.module

val viewModelModule: Module = module {

    viewModelOf(::MainScreenViewModel)

}