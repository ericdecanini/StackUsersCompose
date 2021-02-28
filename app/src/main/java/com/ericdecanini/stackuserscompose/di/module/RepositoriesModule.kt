package com.ericdecanini.stackuserscompose.di.module

import com.ericdecanini.stackuserscompose.repository.UsersRepository
import com.ericdecanini.stackuserscompose.repository.UsersRepositoryImpl
import com.ericdecanini.stackuserscompose.service.stack.StackApiService
import dagger.Module
import dagger.Provides

@Module
class RepositoriesModule {

    @Provides
    fun provideUsersRepository(stackApiService: StackApiService): UsersRepository
            = UsersRepositoryImpl(stackApiService)

}