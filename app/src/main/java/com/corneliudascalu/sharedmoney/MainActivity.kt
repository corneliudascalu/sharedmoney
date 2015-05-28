package com.corneliudascalu.sharedmoney;

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import org.jetbrains.anko.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        verticalLayout {
            var toolbar = toolbarSupport() {
                title = "Hello"
                backgroundColor = R.color.material_blue_grey_800
            }
            setSupportActionBar(toolbar)
            button("OK?") {
                onClick { toast("Poof!") }
            }
        }
    }
}