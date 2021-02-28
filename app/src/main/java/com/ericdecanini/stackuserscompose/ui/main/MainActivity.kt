package com.ericdecanini.stackuserscompose.ui.main

import android.os.Bundle
import com.ericdecanini.stackuserscompose.R
import dagger.android.support.DaggerAppCompatActivity

class MainActivity : DaggerAppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}