package com.ericdecanini.stackuserscompose.di.module

import com.ericdecanini.stackuserscompose.di.module.services.ServicesModule
import com.ericdecanini.stackuserscompose.di.module.ui.UiModule
import dagger.Module
import dagger.android.support.AndroidSupportInjectionModule

@Module(includes = [
    AndroidSupportInjectionModule::class,
    UiModule::class,
    ServicesModule::class,
    NetworkModule::class,
    RepositoriesModule::class
])
class AppModule
