package com.byfrunze.feature_two

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.byfrunze.base.data.DatabaseService
import com.byfrunze.base.data.NetworkService
import com.byfrunze.base.utils.InjectUtils
import com.byfrunze.feature_two.di.component.DaggerFeatureTwoComponent
import javax.inject.Inject

class FeatureTwoActivity : AppCompatActivity() {

    @Inject
    lateinit var databaseService: DatabaseService

    @Inject
    lateinit var networkService: NetworkService

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_feature_two)

        DaggerFeatureTwoComponent
            .builder()
            .baseComponent(InjectUtils.provideBaseComponent(applicationContext))
            .build()
            .inject(this)
        Log.d("DaggerSample_FeatureTwo", databaseService.toString())

    }
}
