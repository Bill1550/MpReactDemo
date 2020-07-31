
plugins {
    id("com.android.application")
    kotlin("android")
    id("kotlin-android-extensions")
}


android {
    compileSdkVersion(Versions.compile_sdk)
    buildToolsVersion = Versions.buildToolsVersion

    defaultConfig {
        applicationId = "com.loneoaktech.tests.mpreactdemo"
        minSdkVersion( Versions.min_sdk )
        targetSdkVersion( Versions.target_sdk )
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    packagingOptions {
        exclude("META-INF/*.kotlin_module")
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles( getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro" )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    kotlinOptions {
        jvmTarget = "1.8"
    }

    lintOptions {
        isWarningsAsErrors = true
        isAbortOnError = true
    }
}

dependencies {

    implementation(kotlin("stdlib-jdk7"))
    implementation(Deps.Coroutines.android)
    implementation(Deps.Serialization.android)

    implementation(Deps.core_ktx)
    implementation(Deps.app_compat_x)
    implementation(Deps.material_x)
    implementation(Deps.constraintlayout)
    implementation(Deps.recyclerView)
    implementation(Deps.navigation_fragment)
    implementation(Deps.navigation_fragment_ktx)
    implementation(Deps.navigation_ui)
    implementation(Deps.navigation_ui_ktx)
    implementation(Deps.lifecycle_extension)

    testImplementation(Deps.junit)

    androidTestImplementation(Deps.AndroidXTest.junit)
    androidTestImplementation(Deps.AndroidXTest.espresso_core)
}