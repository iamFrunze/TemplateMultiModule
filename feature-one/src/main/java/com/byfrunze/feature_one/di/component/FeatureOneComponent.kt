package com.byfrunze.feature_one.di.component

import com.byfrunze.base.di.component.BaseComponent
import com.byfrunze.feature_one.FeatureOneActivity
import com.byfrunze.feature_one.di.module.FeatureOneModule
import com.byfrunze.feature_one.di.scopes.FeatureOneScope
import dagger.Component

@FeatureOneScope
@Component(
    dependencies = [BaseComponent::class],
    modules = [FeatureOneModule::class]
)
interface FeatureOneComponent {

    fun inject(activity: FeatureOneActivity)

}