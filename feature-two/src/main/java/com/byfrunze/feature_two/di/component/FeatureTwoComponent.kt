package com.byfrunze.feature_two.di.component

import com.byfrunze.base.di.component.BaseComponent
import com.byfrunze.feature_two.FeatureTwoActivity
import com.byfrunze.feature_two.di.module.FeatureTwoModule
import com.byfrunze.feature_two.di.scopes.FeatureTwoScope
import dagger.Component

@FeatureTwoScope
@Component(
    dependencies = [BaseComponent::class],
    modules = [FeatureTwoModule::class]
)
interface FeatureTwoComponent {

    fun inject(activity: FeatureTwoActivity)

}