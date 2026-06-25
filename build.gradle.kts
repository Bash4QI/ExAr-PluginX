buildscript {
    repositories {
        google()
        mavenCentral()
        // فقط المستودعات الرسمية الأساسية
    }
    dependencies {
        classpath("com.android.tools.build:gradle:8.1.0")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.9.20")
        // نستخدم حزمة الرسمية المستقرة من GitHub Packages مباشرة
        classpath("com.github.recloudstream:gradle:master-SNAPSHOT")
    }
}

allprojects {
    repositories {
        google()
        mavenCentral()
        maven { url = uri("https://jitpack.io") }
    }
}
