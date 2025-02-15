pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
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
//    versionCatalogs {
//        create("libs") {
//            version("android-gradle-plugin", "8.2.0")
//            version("kotlin", "1.9.0")
//
//            plugin("android-library", "com.android.library").version("android-gradle-plugin")
//            plugin("kotlin-android", "org.jetbrains.kotlin.android").version("kotlin")
//        }
//    }
}

rootProject.name = "testlib"
include(":app")
include(":link")
