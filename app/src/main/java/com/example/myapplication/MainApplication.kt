package com.example.myapplication

import com.google.android.play.core.splitcompat.SplitCompatApplication

class MainApplication : SplitCompatApplication() {
    override fun onCreate() {
        super.onCreate()

        Initializer().configure(context = this)
    }
}

