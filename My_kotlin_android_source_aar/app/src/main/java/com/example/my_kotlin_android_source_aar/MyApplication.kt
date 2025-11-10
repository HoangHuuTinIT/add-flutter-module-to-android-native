package com.example.my_kotlin_android_source_aar

import android.app.Application
import io.flutter.embedding.engine.FlutterEngine
import io.flutter.embedding.engine.FlutterEngineCache
import io.flutter.embedding.engine.dart.DartExecutor

class MyApplication : Application() {
    lateinit var flutterEngine : FlutterEngine

    override fun onCreate() {
        super.onCreate()

        //Khởi tạo FlutterEngine
        flutterEngine = FlutterEngine(this)

        // Chạy Dart code
        flutterEngine.dartExecutor.executeDartEntrypoint(
            DartExecutor.DartEntrypoint.createDefault()
        )

        // Lưu cache lại để FlutterActivity sử dụng sau
        FlutterEngineCache
            .getInstance()
            .put("my_engine_id", flutterEngine)

    }
}