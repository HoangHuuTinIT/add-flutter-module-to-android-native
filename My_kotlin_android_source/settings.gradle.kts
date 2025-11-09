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
    //Lấy địa chỉ tải Flutter từ biến môi trường
    val storageUrl: String = System.getenv("FLUTTER_STORAGE_BASE_URL") ?: "https://storage.googleapis.com"
    repositories {
        google()
        mavenCentral()
        //Nguồn plugin và dependencies của Flutter
        maven("$storageUrl/download.flutter.io")
    }
}

rootProject.name = "My_kotlin_android_source"
include(":app")
//Thay flutter_module_4 bằng tên module của bạn
val filePath = settingsDir.parentFile.toString() + "/flutter_module_4/.android/include_flutter.groovy"
apply(from = File(filePath))
