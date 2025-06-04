plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
}

android {
    namespace = "com.example.myapplication"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.myapplication"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "11"
    }
}

dependencies {

    implementation(libs.misc.kotlinReflect)
    implementation(libs.misc.kotlinParcelize)
    implementation(libs.misc.kotlinstdlib)
    implementation(libs.misc.kotlinstdlibCommon)

    implementation(libs.misc.datadogRum) {
        exclude("com.google.code.gson", "gson")
    }
    implementation(libs.misc.datadogLogs) {
        exclude("com.google.code.gson", "gson")
    }
    implementation(libs.misc.datadogTrace) {
        exclude("com.google.code.gson", "gson")
    }
    implementation(libs.misc.datadogOkhttp) {
        exclude("com.google.code.gson", "gson")
    }

    coreLibraryDesugaring(libs.misc.desugarJdkLibs)

    implementation(libs.misc.playFeatureDelivery)
    implementation(libs.misc.playFeatureDeliveryKtx)

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
}