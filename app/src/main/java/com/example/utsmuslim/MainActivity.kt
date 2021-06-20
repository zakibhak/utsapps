package com.example.utsmuslim

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val Button1 = findViewById<Button>(R.id.button_sudah)
        Button1.setOnClickListener{
            val Intent = Intent(this,sudahact::class.java)
            startActivity(Intent)
        }

        val Button2 = findViewById<Button>(R.id.button_belum)
        Button2.setOnClickListener{
            val Intent = Intent(this,belumact::class.java)
            startActivity(Intent)
        }
    }
}