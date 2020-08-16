package com.byfrunze.base.di.module

import com.byfrunze.base.data.DatabaseService
import com.byfrunze.base.data.NetworkService
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class BaseModule {

    @Provides
    @Singleton
    fun provideDatabaseService() = DatabaseService()

    @Provides
    @Singleton
    fun provideNetworkService() = NetworkService()
}