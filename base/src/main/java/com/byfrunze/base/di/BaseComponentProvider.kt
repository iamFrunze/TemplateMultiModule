package com.byfrunze.base.di

import com.byfrunze.base.di.component.BaseComponent

interface BaseComponentProvider {

    fun provideBaseComponent(): BaseComponent

}