package com.ericdecanini.stackuserscompose.di.module.ui

import dagger.Module

@Module(includes = [
    ActivityBuildersModule::class,
    ViewModelFactoryModule::class
])
class UiModule