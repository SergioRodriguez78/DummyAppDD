package com.example.myapplication.instrumentationTest

internal abstract class SDKActivatorSetup {

    protected open fun before() {}
    protected open fun configRUM() {}
    protected open fun configLogs() {}
    protected open fun configTraces() {}
    protected open fun configErrorTracking() {}
    protected open fun after() {}

    fun run() {

        before()

        configRUM()


        configLogs()


        configTraces()


        configErrorTracking()

        after()
    }
}
