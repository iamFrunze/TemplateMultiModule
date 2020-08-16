package com.byfrunze.templatemultimodule.di.component

import com.byfrunze.base.di.component.BaseComponent
import com.byfrunze.templatemultimodule.MainActivity
import com.byfrunze.templatemultimodule.di.module.MainActivityModule
import com.byfrunze.templatemultimodule.di.scopes.MainActivityScope
import dagger.Component

@MainActivityScope
@Component(
    dependencies = [BaseComponent::class],
    modules = [MainActivityModule::class]
)
interface MainActivityComponent {

    fun inject(activity: MainActivity)

}