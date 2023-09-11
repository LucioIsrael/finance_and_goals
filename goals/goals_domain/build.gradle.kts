plugins {
    `android-library`
    `kotlin-android`
}

apply(from = "$rootDir/base-module.gradle")

android {
    namespace = "com.br.project.goals_domain"
}

dependencies {
    implementation(project(Modules.core))
}