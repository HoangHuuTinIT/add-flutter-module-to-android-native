package com.example.my_kotlin_android_source

import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import io.flutter.embedding.android.FlutterActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val btnGoToFlutter: Button = findViewById(R.id.btnGoToFlutter)
        btnGoToFlutter.setOnClickListener {
            startActivity(
                FlutterActivity
                    //my_engine_id chính là id của cache bạn đã tạo
                    .withCachedEngine("my_engine_id")
                    .build(this)
            )
        }

    }
}