package com.example.my_kotlin_android_source_aar

import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import io.flutter.embedding.android.FlutterActivity;
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val btnGoToFlutter: Button = findViewById(R.id.btnGoToFlutter)
        btnGoToFlutter.setOnClickListener {
            startActivity(
                FlutterActivity.createDefaultIntent(this)
            )
        }
    }
}