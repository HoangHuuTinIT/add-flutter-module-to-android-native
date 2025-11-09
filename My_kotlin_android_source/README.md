Kotlin Android Host tích hợp Flutter module(sử dụng mã nguồn)



Giới thiệu

Dự án này là một Android native app đơn giản sử dụng kotlin, được thiết kế để nhúng 1 Flutter module (sử dụng mã nguồn) có sẵn, ở trong ví dụ này Flutter module sẽ là flutter\_module\_4.



Tính năng:



Ứng dụng bao gồm 1 button, sau khi nhấn vào button sẽ tiến hành chuyển qua giao diện của Flutter module



Cấu trúc ứng dụng:



My\_kotlin\_android\_source/

├── app/                            # Module ứng dụng chính

│   ├── build.gradle.kts            # (Cấu hình build cho module 'app')

│   ├── src/

│       ├── main/

│           ├── AndroidManifest.xml   # (Tệp kê khai ứng dụng)

│           ├── .../java/

│           │           └── .../MainActivity.kt # (Activity chính của bạn)

│           └── res/

│              ├── layout/

│                  └── activity\_main.xml # (Layout chính)

│

├── gradle/

│   └── libs.versions.toml        # (Quản lý phiên bản dependencies)

│

├── build.gradle.kts                # (Cấu hình build gốc của project)

├── settings.gradle.kts             # (QUAN TRỌNG: Nơi khai báo module Flutter)

└── README.md



Cài đặt:

Với việc bạn clone repo chứa 2 file Flutter module và My\_kotlin\_android\_source về ở cùng thư mục cha. Bạn chỉ cần mở và chạy My\_kotlin\_android\_source lúc đó module cũng được build đồng thời.



Nếu bạn muốn di chuyển vị trí của Flutter module (flutter\_module\_4) thì bạn phải tiến hành điều chỉnh filePath trong settings.gradle.kts(Project Settings) để điều chỉnh đúng đến được vị trí của file include\_flutter.groovy trong module:



rootProject.name = "My\_kotlin\_android\_source"

include(":app")

//Thay đường dẫn này đến đúng địa chỉ trên máy bạn

val filePath = settingsDir.parentFile.toString() + "/flutter\_module\_4/.android/include\_flutter.groovy"

apply(from = File(filePath))

