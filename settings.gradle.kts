pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "FinancasEMetas"
include(":app")
include(":core")
include(":finance")
include(":finance:finance_presentation")
include(":finance:finance_domain")
include(":goals")
include(":goals:goals_presentation")
include(":goals:goals_domain")
include(":finance:finance_data")
include(":goals:goals_data")
