package com.corneliudascalu.sharedmoney;

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar
import org.jetbrains.anko.*
import kotlinx.android.synthetic.activity_main.*;

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)
        testButton.setOnClickListener { toast("Hey!") }

        var user = User("Corneliu", "Dascalu")
        text1.setText(user.toString())
        val loan = Loan("1","2",24.5)
        text2.setText(loan.toString())
    }
}