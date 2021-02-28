package com.ericdecanini.stackuserscompose.di.module.stack

import com.ericdecanini.stackuserscompose.service.stack.StackApi
import com.ericdecanini.stackuserscompose.service.stack.StackApiService
import com.ericdecanini.stackuserscompose.service.stack.StackApiServiceImpl
import com.ericdecanini.stackuserscompose.service.stack.adapter.UsersJsonAdapter
import com.ericdecanini.stackuserscompose.service.stack.mapper.UsersMapper
import com.ericdecanini.stackuserscompose.service.stack.mapper.UsersMapperImpl
import com.ericdecanini.stackuserscompose.util.Constants
import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import dagger.Module
import dagger.Provides
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import javax.inject.Singleton

@Module
class StackModule {

    @Singleton
    @Provides
    fun provideStackRetrofit(okHttpClient: OkHttpClient): Retrofit {
        val moshi = Moshi.Builder()
            .add(KotlinJsonAdapterFactory())
            .add(UsersJsonAdapter())
            .build()

        return Retrofit.Builder()
            .addConverterFactory(MoshiConverterFactory.create(moshi))
            .client(okHttpClient)
            .baseUrl(Constants.REPO_BASE_URL)
            .build()
    }

    @Singleton
    @Provides
    fun provideStackApiService(stackApi: StackApi): StackApiService {
        return StackApiServiceImpl(stackApi)
    }

    @Singleton
    @Provides
    fun provideStackApi(retrofit: Retrofit): StackApi {
        return retrofit.create(StackApi::class.java)
    }

    @Singleton
    @Provides
    fun provideUsersMapper(): UsersMapper = UsersMapperImpl()

}