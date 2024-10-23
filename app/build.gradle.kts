import android.databinding.tool.writer.ViewBinding

plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.kotlin.compose)

}

android {
    namespace = "tm.ran.analogcl"
    compileSdk = 34

    defaultConfig {
        applicationId = "tm.ran.analogcl"
        minSdk = 28
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

    }
buildFeatures {
    viewBinding = true
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
        jvmTarget = "1.8"
    }
    buildFeatures {
        compose = true
    }
}
dependencies {

    implementation(libs.play.services.wearable)
    implementation(platform(libs.compose.bom))
    implementation(libs.ui)
    implementation(libs.ui.graphics)
    implementation(libs.ui.tooling.preview)
    implementation(libs.compose.material)
    implementation(libs.compose.foundation)
    implementation(libs.wear.tooling.preview)
    implementation(libs.activity.compose)
    implementation(libs.core.splashscreen)
     androidTestImplementation(platform(libs.compose.bom))
    androidTestImplementation(libs.ui.test.junit4)
    debugImplementation(libs.ui.tooling)
    debugImplementation(libs.ui.test.manifest)
    implementation ("com.google.android.material:material:1.12.0")
    //implementation (libs.watchface.editor)
    implementation (libs.watchface)
    implementation (libs.watchface.style)
    implementation (libs.wear)
    implementation ("androidx.wear.watchface:watchface-complications-rendering:1.2.1")
    implementation ("androidx.wear.watchface:watchface-editor:1.2.1")

}