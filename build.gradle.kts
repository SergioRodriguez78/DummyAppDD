// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.kotlin.android) apply false
}
buildscript {
    dependencies {
        classpath(libs.misc.ddSdkPlugin)
    }
}

allprojects {
    configurations.configureEach {
        resolutionStrategy{
            force(libs.misc.gson)
            force( libs.misc.okhttp3)
            force( libs.misc.kotlinstdlib)
            force( libs.misc.kotlinstdlibCommon)
            force( libs.misc.kotlinReflect)
            force( libs.misc.kotlinParcelize)
            force (libs.misc.playFeatureDelivery)
                    force (libs.misc.playFeatureDeliveryKtx)
        }
    }
}
