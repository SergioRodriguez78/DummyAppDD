package com.example.myapplication

import android.content.Context
import com.example.myapplication.instrumentationTest.DatadogSDKSetup

class Initializer {
    fun configure(context: Context){
        DatadogSDKSetup(context = context)
    }
}