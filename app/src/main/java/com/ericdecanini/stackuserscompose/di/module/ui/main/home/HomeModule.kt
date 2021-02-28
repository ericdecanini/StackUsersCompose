package com.ericdecanini.stackuserscompose.di.module.ui.main.home

import androidx.lifecycle.ViewModel
import com.ericdecanini.stackuserscompose.di.ViewModelKey
import com.ericdecanini.stackuserscompose.ui.main.home.HomeViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module(includes = [HomeModule.ViewModelModule::class])
class HomeModule {

    @Module
    internal abstract class ViewModelModule {

        @Binds
        @IntoMap
        @ViewModelKey(HomeViewModel::class)
        internal abstract fun bindHomeViewModel(viewModel: HomeViewModel): ViewModel
    }
}