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
## Cách tích hợp:
Tham khảo tại đường link : 
```text
https://docs.google.com/document/d/1wwVZMIticAMh5WwTF1ljF79VzA4zHaN_swNXS-dFBFA/edit?tab=t.0#heading=h.p4ubxa1zwa0h
```
Hoặc đọc file READ.ME của My_kotlin_android_source và My_kotlin_android_source_aar
