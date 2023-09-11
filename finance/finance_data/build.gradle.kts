plugins {
    `android-library`
    `kotlin-android`
}

apply(from = "$rootDir/base-module.gradle")

android {
    namespace = "com.br.project.finance_data"
}

dependencies {
    implementation(project(Modules.core))
    implementation(project(Modules.financeDomain))

    "kapt"(Room.roomCompiler)
    implementation(Room.roomKtx)
    implementation(Room.roomRuntime)
}