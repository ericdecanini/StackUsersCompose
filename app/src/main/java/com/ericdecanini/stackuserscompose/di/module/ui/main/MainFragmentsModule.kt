package com.ericdecanini.stackuserscompose.di.module.ui.main

import com.ericdecanini.stackuserscompose.di.module.ui.main.home.HomeModule
import com.ericdecanini.stackuserscompose.ui.main.home.HomeFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class MainFragmentsModule {

    @ContributesAndroidInjector(modules = [HomeModule::class])
    abstract fun contributeHomeFragment(): HomeFragment

}