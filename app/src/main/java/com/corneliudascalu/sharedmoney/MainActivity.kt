package com.corneliudascalu.sharedmoney;

import android.os.Bundle
import android.support.v7.app.ActionBarActivity
import org.jetbrains.anko.button
import org.jetbrains.anko.onClick
import org.jetbrains.anko.toast
import org.jetbrains.anko.verticalLayout

class MainActivity : ActionBarActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        verticalLayout {
            button("OK?") {
                onClick { toast("Poof!") }
            }
        }
    }
}