plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.jetbrains.kotlin.android)
}

android {
    namespace = "com.example.my_kotlin_android_source"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.my_kotlin_android_source"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"
        //Cấu hình NDK
        ndk {
            abiFilters += listOf("armeabi-v7a", "arm64-v8a", "x86_64")
        }
        //Kết thúc cấu hình NDK
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
        create("profile") {
            initWith(getByName("debug"))
        }
    }

    compileOptions {
        isCoreLibraryDesugaringEnabled =true // Bật tính năng Core library desugaring
        sourceCompatibility = JavaVersion.VERSION_11 //tối thiểu phiên bản 11
        targetCompatibility = JavaVersion.VERSION_11//tối thiểu phiên bản 11
    }

    kotlinOptions {
        jvmTarget = "11"
    }
}

dependencies {
    //build module flutter cùng với :app
    implementation(project(":flutter"))
    // Thư viện runtime hỗ trợ desugaring
    coreLibraryDesugaring("com.android.tools:desugar_jdk_libs:2.1.5")
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
}