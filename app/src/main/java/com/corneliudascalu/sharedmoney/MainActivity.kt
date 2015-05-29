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
<<<<<<< HEAD
=======
                navigationIcon = R.drawable.abc_ic_menu_copy_mtrl_am_alpha
>>>>>>> 8cc7281... Menu icon
            }
            setSupportActionBar(toolbar)
            button("OK?") {
                onClick { toast("Poof!") }
                onLongClick { toast("Long press") }
            }
        }
    }
}