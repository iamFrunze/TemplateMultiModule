package com.byfrunze.templatemultimodule

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.byfrunze.base.data.DatabaseService
import com.byfrunze.base.data.NetworkService
import com.byfrunze.base.utils.InjectUtils
import com.byfrunze.feature_one.FeatureOneActivity
import com.byfrunze.templatemultimodule.di.component.DaggerMainActivityComponent
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var databaseService: DatabaseService
    @Inject
    lateinit var networkService: NetworkService

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        DaggerMainActivityComponent
            .builder()
            .baseComponent(InjectUtils.provideBaseComponent(applicationContext))
            .build()
            .inject(this)
        Log.d("DaggerSample_Main", databaseService.toString())
        startActivity(Intent(this, FeatureOneActivity::class.java))

    }
}
