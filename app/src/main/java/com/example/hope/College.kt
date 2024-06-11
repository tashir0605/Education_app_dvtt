package com.example.hope

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class College : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_college)

        val Acadbutton = findViewById<TextView>(R.id.heading1)
        Acadbutton.setOnClickListener {
            val intent = Intent(this, AcacActivity::class.java)
            startActivity(intent)
        }
        val Sacbutton = findViewById<TextView>(R.id.heading2)
        Sacbutton.setOnClickListener {
            val intent = Intent(this, Sacactivity::class.java)
            startActivity(intent)
        }
    }
}