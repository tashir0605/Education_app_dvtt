package com.example.hope

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SectionA : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_section)


        val secondpagebutton = findViewById<TextView>(R.id.button_b)
        secondpagebutton.setOnClickListener {
            val intent = Intent(this, SectionB::class.java)
            startActivity(intent)

        }
    }
}