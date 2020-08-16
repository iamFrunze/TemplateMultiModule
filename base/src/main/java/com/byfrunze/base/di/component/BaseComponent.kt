package com.byfrunze.base.di.component

import android.app.Application
import com.byfrunze.base.data.DatabaseService
import com.byfrunze.base.data.NetworkService
import com.byfrunze.base.di.module.BaseModule
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [BaseModule::class])
interface BaseComponent {

    fun inject(app: Application)

    fun getNetworkService(): NetworkService

    fun getDatabaseService(): DatabaseService

}