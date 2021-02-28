package com.ericdecanini.stackuserscompose.di.module.ui

import androidx.lifecycle.ViewModelProvider
import com.ericdecanini.stackuserscompose.di.ViewModelFactory
import dagger.Binds
import dagger.Module

@Module
abstract class ViewModelFactoryModule {

    @Binds
    internal abstract fun bindViewModelFactory(factory: ViewModelFactory): ViewModelProvider.Factory

}