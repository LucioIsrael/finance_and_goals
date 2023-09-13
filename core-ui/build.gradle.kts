plugins {
    `android-library`
    `kotlin-android`
}

apply(from = "$rootDir/compose-module.gradle")

android {
    namespace = "com.br.project.core_ui"
}

dependencies {
    implementation(project(Modules.core))
}