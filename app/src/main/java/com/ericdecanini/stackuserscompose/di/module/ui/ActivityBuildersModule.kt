package com.ericdecanini.stackuserscompose.di.module.ui

import com.ericdecanini.stackuserscompose.di.module.ui.main.MainModule
import com.ericdecanini.stackuserscompose.ui.main.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBuildersModule {

    @ContributesAndroidInjector(
        modules = [MainModule::class]
    )
    abstract fun contributeMainActivity(): MainActivity
}