package com.ericdecanini.stackuserscompose.di.module.services

import com.ericdecanini.stackuserscompose.di.module.stack.StackModule
import dagger.Module

@Module(includes = [
    StackModule::class
])
class ServicesModule