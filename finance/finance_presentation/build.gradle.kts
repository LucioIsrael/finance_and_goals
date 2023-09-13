plugins {
    `android-library`
    `kotlin-android`
}

apply(from = "$rootDir/compose-module.gradle")

android {
    namespace = "com.br.project.finance_presentation"
}

dependencies {
    implementation(project(Modules.core))
    implementation(project(Modules.coreUi))
    implementation(project(Modules.financeDomain))
}