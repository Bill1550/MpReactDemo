object Versions {
    val min_sdk = 21
    val target_sdk = 29
    val compile_sdk = 29

    val kotlin = "1.3.72"
    val androidx_test = "1.2.0"
    val androidx_test_ext = "1.1.1"
    val android_gradle_plugin = "4.0.0"
    val buildToolsVersion = "29.0.0"
    val junit = "4.13"
    val sqlDelight = "1.3.0"
    val ktor = "1.3.2"
    val stately = "1.0.2"
    val multiplatformSettings = "0.6"
    val coroutines = "1.3.5-native-mt"
    val koin = "3.0.0-alpha-2"
    val serialization = "0.20.0"
    val cocoapodsext = "0.9"
    val kermit = "0.1.5"
    val lifecycle = "2.1.0"
    val karmok = "0.1.7"
    val ktlint_gradle_plugin = "9.2.1"
    val robolectric = "4.3.1"
    val navigation = "2.3.0"
    val espresso = "3.2.0"
}

object Deps {
    val app_compat_x = "androidx.appcompat:appcompat:1.1.0"
    val material_x = "com.google.android.material:material:1.1.0"
    val core_ktx = "androidx.core:core-ktx:1.2.0"
    val constraintlayout = "androidx.constraintlayout:constraintlayout:1.1.3"
    val recyclerView = "androidx.recyclerview:recyclerview:1.1.0"
    val android_gradle_plugin = "com.android.tools.build:gradle:${Versions.android_gradle_plugin}"
    val junit = "junit:junit:${Versions.junit}"
    val stately = "co.touchlab:stately-common:${Versions.stately}"
    val multiplatformSettings =
        "com.russhwolf:multiplatform-settings:${Versions.multiplatformSettings}"
    val multiplatformSettingsTest =
        "com.russhwolf:multiplatform-settings-test:${Versions.multiplatformSettings}"
    val koinCore = "org.koin:koin-core:${Versions.koin}"
    val koinTest = "org.koin:koin-test:${Versions.koin}"
    val cocoapodsext = "co.touchlab:kotlinnativecocoapods:${Versions.cocoapodsext}"
    val kermit = "co.touchlab:kermit:${Versions.kermit}"
    val lifecycle_viewmodel = "android.arch.lifecycle:viewmodel:${Versions.lifecycle}"
    val lifecycle_viewmodel_extensions =
        "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.lifecycle}"
    val lifecycle_livedata = "android.arch.lifecycle:livedata:${Versions.lifecycle}"
    val lifecycle_extension = "android.arch.lifecycle:extensions:${Versions.lifecycle}"
    val karmok = "co.touchlab:karmok-library:${Versions.karmok}"
    val robolectric = "org.robolectric:robolectric:${Versions.robolectric}"
    val navigation_fragment = "androidx.navigation:navigation-fragment:${Versions.navigation}"
    val navigation_ui = "androidx.navigation:navigation-ui:${Versions.navigation}"
    val navigation_fragment_ktx = "androidx.navigation:navigation-fragment-ktx:${Versions.navigation}"
    val navigation_ui_ktx = "androidx.navigation:navigation-ui-ktx:${Versions.navigation}"

    object AndroidXTest {
        val core = "androidx.test:core:${Versions.androidx_test}"
        val junit = "androidx.test.ext:junit:${Versions.androidx_test_ext}"
        val runner = "androidx.test:runner:${Versions.androidx_test}"
        val rules = "androidx.test:rules:${Versions.androidx_test}"
        val espresso_core = "androidx.test.espresso:espresso-core:${Versions.espresso}"
    }

    object KotlinTest {
        val common = "org.jetbrains.kotlin:kotlin-test-common:${Versions.kotlin}"
        val annotations = "org.jetbrains.kotlin:kotlin-test-annotations-common:${Versions.kotlin}"
        val jvm = "org.jetbrains.kotlin:kotlin-test:${Versions.kotlin}"
        val junit = "org.jetbrains.kotlin:kotlin-test-junit:${Versions.kotlin}"
    }

    object Coroutines {
        val common = "org.jetbrains.kotlinx:kotlinx-coroutines-core-common:${Versions.coroutines}"
        val jdk = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.coroutines}"
        val native = "org.jetbrains.kotlinx:kotlinx-coroutines-core-native:${Versions.coroutines}"
        val android = "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.coroutines}"
        val test = "org.jetbrains.kotlinx:kotlinx-coroutines-test:${Versions.coroutines}"
    }

    object Serialization {
        val common = "org.jetbrains.kotlinx:kotlinx-serialization-runtime-common:${Versions.serialization}"
        val android = "org.jetbrains.kotlinx:kotlinx-serialization-runtime:${Versions.serialization}"
        val jvm = "org.jetbrains.kotlinx:kotlinx-serialization-runtime:${Versions.serialization}"
        val native = "org.jetbrains.kotlinx:kotlinx-serialization-runtime-native:${Versions.serialization}"
    }
}