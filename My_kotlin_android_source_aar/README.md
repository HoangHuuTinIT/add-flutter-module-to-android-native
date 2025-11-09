#  Kotlin Android Host tích hợp Flutter module (sử dụng AAR)

##  Giới thiệu

Dự án này là một Android native app đơn giản sử dụng kotlin, được thiết kế để nhúng 1 Flutter module (sử dụng file aar) có sẵn, ở trong ví dụ này Flutter module sẽ là flutter_module_4.

---

##  Tính năng

* Ứng dụng bao gồm 1 button, sau khi nhấn vào button sẽ tiến hành chuyển qua giao diện của Flutter module

---

##  Cấu trúc ứng dụng

```text
My_kotlin_android_source_aar/
├── app/                            # Module ứng dụng chính
│   ├── build.gradle.kts            # (Cấu hình build cho module 'app')
│   ├── src/
│   │   ├── main/
│   │   │   ├── AndroidManifest.xml   # (Tệp kê khai ứng dụng)
│   │   │   ├── .../java/
│   │   │   │   └── .../MainActivity.kt # (Activity chính của bạn)
│   │   └── res/
│   │       ├── layout/
│   │       │   └── activity_main.xml # (Layout chính)
│
├── gradle/
│   └── libs.versions.toml        # (Quản lý phiên bản dependencies)
│
├── build.gradle.kts                # (Cấu hình build gốc của project)
├── settings.gradle.kts             # (QUAN TRỌNG: Nơi khai báo module Flutter)
└── README.md

---

## Cài đặt
Để chạy được Flutter module điều chỉnh dependencyResolutionManagement trong settings.gradle.kts (Project Settings) như sau:

Kotlin

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.PREFER_SETTINGS)
    repositories {
        google()
        mavenCentral()
        maven("[https://storage.googleapis.com/download.flutter.io](https://storage.googleapis.com/download.flutter.io)")
	//thay C:\\Users\\Admin\\AndroidStudioProjects\\flutter_module_4\\build\\host\\outputs\\repo bằng đường dẫn thực tế của module 	được clone về
        maven(url = "C:\\Users\\Admin\\AndroidStudioProjects\\flutter_module_4\\build\\host\\outputs\\repo")
    }
}
