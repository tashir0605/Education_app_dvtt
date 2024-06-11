package com.example.hope

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SectionB : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_section_b)




        val secondpagebutton = findViewById<TextView>(R.id.button_second)
        secondpagebutton.setOnClickListener {
            val intent = Intent(this, SectionA::class.java)
            startActivity(intent)
        }
    }
}