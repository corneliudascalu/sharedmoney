package com.corneliudascalu.sharedmoney

import android.app.Application
import com.parse.Parse

/**
 */
public class MoneyApp : Application() {

    companion object {
        public val APPLICATION_ID: String = "5b6uY59Cwj6auWlpZbkytDrD62fHsZDWC6Ch4IuN"
        public val CLIENT_KEY: String = "1ZaqEnGfYzGJuOES6Yci25mVPjgp78loGs2Xy7b2"
    }

    override fun onCreate() {
        super.onCreate()
        Parse.enableLocalDatastore(this)
        Parse.initialize(this, APPLICATION_ID, CLIENT_KEY);
    }
}