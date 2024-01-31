package com.example.class20240130

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import com.example.class20240130.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView1: TextView = findViewById(R.id.text1)
        textView1.setText("집가고 싶어요...")

        val btn2: Button = findViewById(R.id.btn2)
        btn2.visibility = View.GONE

    }
}