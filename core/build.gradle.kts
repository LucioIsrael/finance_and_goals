plugins {
    `android-library`
    `kotlin-android`
}

apply(from = "$rootDir/base-module.gradle")

android {
    namespace = "com.br.project.core"
}

/**
 * Se eu quiser adicionar alguma dependencia adicional é só descomentar aqui embaixo
 */
//dependencies {
//}