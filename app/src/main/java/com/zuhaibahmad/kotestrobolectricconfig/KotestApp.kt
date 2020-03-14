package com.zuhaibahmad.kotestrobolectricconfig

import android.app.Application
import android.util.Log

class KotestApp : Application() {

    override fun onCreate() {
        super.onCreate()

        Log.i(getAppName(), "${getAppName()} started!")
    }

    fun getAppName() = "KotestApp"
}