package com.example.myapplication.instrumentationTest

import android.content.Context
import android.util.Log
import com.datadog.android.Datadog
import com.datadog.android.core.configuration.Configuration
import com.datadog.android.privacy.TrackingConsent

internal class DatadogSDKSetup(
    val context: Context,
) : SDKActivatorSetup() {

    private val credential = DatadogSDKCredentials()

    override fun before() {
        super.before()

        //logic to get app build info
        val buildType = "release"

        val dataDogConfiguration = Configuration.Builder(
            credential.clientToken,
            buildType
        ).apply {
            // logic to get if set  crahs report
            val isTrue = true
            setCrashReportsEnabled(isTrue)
        }.build()

        // logic to get if is ddebug
        val isDebug = false
        if (isDebug)
            Datadog.setVerbosity(Log.INFO)

        Datadog.initialize(context, dataDogConfiguration, TrackingConsent.GRANTED)
    }

    override fun configRUM() {
        super.configRUM()
        // Code no reach so i do not put anything here, but, we configure sometimes this depending on the poblation
    }

    override fun configLogs() {
        super.configLogs()
        // Code no reach so i do not put anything here, but, we configure sometimes this depending on the poblation
    }

    override fun configTraces() {
        super.configTraces()
        // Code no reach so i do not put anything here, but, we configure sometimes this depending on the poblation
    }

    override fun after() {

        // Code no reach so i do not put anything here, but, we configure sometimes this depending on the poblation

    }
}
