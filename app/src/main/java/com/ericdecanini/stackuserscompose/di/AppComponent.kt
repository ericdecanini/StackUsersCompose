package com.ericdecanini.stackuserscompose.di

import android.app.Application
import com.ericdecanini.stackuserscompose.StackUsersApplication
import com.ericdecanini.stackuserscompose.di.module.AppModule
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import javax.inject.Singleton

@Singleton
@Component(modules = [
    AppModule::class
])
interface AppComponent : AndroidInjector<StackUsersApplication> {

    @Component.Factory
    interface Factory {
        fun create(@BindsInstance application: Application): AppComponent
    }
}
