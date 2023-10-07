// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {
    dependencies {
        classpath ("androidx.navigation:navigation-safe-args-generator:2.7.3")
    }

    repositories {
        maven ( "https://jitpack.io")
    }
}


plugins {
    id("com.android.application") version "8.1.1" apply false
    id("org.jetbrains.kotlin.android") version "1.8.10" apply false
    id("androidx.navigation.safeargs") version "2.4.2" apply false
}