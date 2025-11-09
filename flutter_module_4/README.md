Unsplash Flutter Module

Một module Flutter được xây dựng bằng Nylo Framework, đóng vai trò như một client cho API của Unsplash.



Giới thiệu

Dự án này là một Flutter Module độc lập, được thiết kế để nhúng (add-to-app) vào một ứng dụng Android gốc (Native) có sẵn.



Dự án được xây dựng trên Nylo Framework, tuân thủ kiến trúc Controller/Service/State rõ ràng, giúp dễ dàng bảo trì và mở rộng.



Tính năng:



Giao diện Tab: Giao diện chính sử dụng TabBar với 2 tab "HOME" và "COLLECTIONS".



Tab HOME:

* Hiển thị danh sách các ảnh
* Xem thông tin chi tiết ảnh
* Xem thông tin người dùng



Tab COLLECTIONS:

* Xem danh sách collection
* Xem thông tin collection
* Xem thông tin người tạo collection



Cuộn vô hạn (Infinite Scroll): Tải thêm ảnh khi người dùng cuộn xuống cuối danh sách ở tất cả các trang (Home, Collections, User Photos, User Likes...).



Cấu trúc ứng dụng:



module\_flutter/

├── env # Chứa API key và cấu hình môi trường

├── pubspec.yaml # Định nghĩa các dependencies của dự án

├── README.md

├── lib/

│   ├── app/

│   │   ├── constants/    # (Nơi chứa các hằng số, VD: app\_dimensions.dart)

│   │   ├── controllers/  # (Logic nghiệp vụ)

│   │   ├── models/       # (Đối tượng dữ liệu)

│   │   ├── networking/   # (ApiService)

│   │   └── states/       # (Các lớp trạng thái)

│   │

│   ├── config/

│   │   └── decoders.dart # (Nơi đăng ký Models, Controllers)

│   │

│   ├── resources/

│   │   ├── pages/        # (Các màn hình)

│   │   └── widgets/      # (Các UI tái sử dụng)

│   │

│   └── routes/

│       └── router.dart (Tệp định nghĩa route chính)

│

├── public/

    ├── app\_icon/# (Icon ứng dụng)

    └── images/ # (Hình ảnh bạn sử dụng)



Cài đặt

Cấu hình API Key : Dự án này cần API key của Unsplash.



Đoạn mã



UNSPLASH\_ACCESS\_KEY="YOUR\_UNSPLASH\_ACCESS\_KEY"

API\_BASE\_URL="https://api.unsplash.com"



Lưu ý: Bạn cần thay thế YOUR\_UNSPLASH\_ACCESS\_KEY bằng API key của bạn.



Cài dependencies:



Bash



flutter pub get

