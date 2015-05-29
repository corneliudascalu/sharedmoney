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
                backgroundColor = R.color.abc_background_cache_hint_selector_material_dark
            }
            setSupportActionBar(toolbar)
            button("OK?") {
                onClick { toast("Poof!") }
            }
        }
    }
}