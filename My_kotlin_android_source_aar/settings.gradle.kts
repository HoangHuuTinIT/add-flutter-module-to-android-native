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
    repositoriesMode.set(RepositoriesMode.PREFER_SETTINGS)
    repositories {
        google()
        mavenCentral()
        maven("https://storage.googleapis.com/download.flutter.io")
        maven(url = "C:\\Users\\Admin\\AndroidStudioProjects\\add_flutter_module_to_android_native_app\\flutter_module_4\\build\\host\\outputs\\repo")
    }
}

rootProject.name = "My_kotlin_android_source_aar"
include(":app")
