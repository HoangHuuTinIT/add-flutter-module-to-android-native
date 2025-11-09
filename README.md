#  Tích hợp Module Flutter vào Android Native (Hai phương pháp)

Repo này trình bày hai phương pháp phổ biến để tích hợp một module Flutter vào một ứng dụng Android Native (Kotlin).

---

##  Cấu trúc Repository

Repo này chứa 3 project độc lập:

1.   **`module_flutter`**:
    * **Mô tả:** Đây là một module Flutter về việc clone ứng dụng resplash, được xây dựng bằng Nylo Framework. Đây là module sẽ được nhúng vào hai ứng dụng Native bên dưới.

2.   **`My_kotlin_android_source`**:
    * **Mô tả:** Ứng dụng Android Native (Host) tích hợp `module_flutter` bằng phương pháp **tham chiếu mã nguồn (Source Code)**.

3.   **`My_kotlin_android_source_aar`**:
    * **Mô tả:** Ứng dụng Android Native (Host) tích hợp `module_flutter` bằng phương pháp **sử dụng file AAR**.
    
---
##  Cài đặt
Dưới đây là hướng dẫn để clone và chạy cả hai phiên bản demo.
### Bước 1: Tải mã nguồn (Clone)
Tải repo:
```text
git clone https://github.com/HoangHuuTinIT/add-flutter-module-to-android-native.git
```
### Bước 2: Cài đặt Flutter Module (Bắt buộc)
Đây là bước bắt buộc để cả hai project Android có thể tìm thấy và build module.
# Đi vào thư mục module
cd module_flutter

# Cài đặt dependencies
flutter pub get

## Chạy Demo
### Cách chạy Demo My_kotlin_android_source (Tích hợp Mã nguồn)
Phương pháp này build Flutter song song với Android.

1.Mở Android Studio.

2.Chọn "Open" (hoặc "Open an existing project").

3.Tìm đến thư mục My_kotlin_android_source (hoặc kotlin-android-host) trong repo bạn vừa clone.

4.Mở lên và đợi Android Studio đồng bộ (Sync) Gradle.

5.Nhấn nút "Run 'app'" để build và chạy ứng dụng.

Lưu ý: Với việc bạn clone repo chứa 2 file Flutter module và My_kotlin_android_source về ở cùng thư mục cha. Bạn chỉ cần mở và chạy My_kotlin_android_source lúc đó module cũng được build đồng thời.

Nếu bạn muốn di chuyển vị trí của Flutter module (flutter_module_4) thì bạn phải tiến hành điều chỉnh filePath trong settings.gradle.kts (Project Settings) để điều chỉnh đúng đến được vị trí của file include_flutter.groovy trong module:
```text
rootProject.name = "My_kotlin_android_source"
include(":app")

//Thay đường dẫn này đến đúng địa chỉ trên máy bạn
val filePath = settingsDir.parentFile.toString() + "/flutter_module_4/.android/include_flutter.groovy"
apply(from = File(filePath))
```
---
### Cách chạy Demo My_kotlin_android_source_aar (Tích hợp tệp AAR)
1.Chạy App Android

2.Mở Android Studio (bạn có thể mở một cửa sổ mới).

3.Chọn "Open".

4.Trỏ đến thư mục My_kotlin_android_source_aar.

5.Đợi Gradle đồng bộ (Sync).

6.Nhấn nút "Run 'app'" để build và chạy ứng dụng.
Lưu ý: Để chạy được Flutter module trong trường hợp sử dụng file AAR, sau khi clone về bạn phải điều chỉnh dependencyResolutionManagement trong settings.gradle.kts (Project Settings) của My_kotlin_android_source_aar như sau:
```text
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
```
## Cách tích hợp chi tiết:
Tham khảo tại đường link : 
```text
https://docs.google.com/document/d/1wwVZMIticAMh5WwTF1ljF79VzA4zHaN_swNXS-dFBFA/edit?tab=t.0#heading=h.p4ubxa1zwa0h
```
Hoặc đọc file READ.ME của My_kotlin_android_source và My_kotlin_android_source_aar
