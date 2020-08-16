package com.byfrunze.templatemultimodule

import android.app.Application
import com.byfrunze.base.di.BaseComponentProvider
import com.byfrunze.base.di.component.BaseComponent
import com.byfrunze.base.di.component.DaggerBaseComponent
import com.byfrunze.base.di.module.BaseModule


class MyApplication : Application(), BaseComponentProvider {

    lateinit var baseComponent: BaseComponent

    override fun onCreate() {
        super.onCreate()

        baseComponent = DaggerBaseComponent
            .builder()
            .baseModule(BaseModule())
            .build()
        baseComponent.inject(this)
    }

    override fun provideBaseComponent(): BaseComponent {
        return baseComponent
    }

}