package com.corneliudascalu.sharedmoney

import android.app.Application
import com.parse.Parse

/**
 */
public class MoneyApp : Application() {
    override fun onCreate() {
        super.onCreate()
        Parse.enableLocalDatastore(this)
        Parse.initialize(this)
    }
}