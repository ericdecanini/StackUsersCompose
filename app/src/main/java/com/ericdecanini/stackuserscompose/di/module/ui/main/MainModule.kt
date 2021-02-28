package com.ericdecanini.stackuserscompose.di.module.ui.main

import androidx.appcompat.app.AppCompatActivity
import com.ericdecanini.stackuserscompose.ui.main.MainActivity
import dagger.Module
import dagger.Provides

@Module(includes = [
    MainFragmentsModule::class
])
class MainModule {

    @Provides
    fun provideMainActivity(activity: MainActivity): AppCompatActivity = activity
}