package com.example.hope

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Sacactivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sacactivity)
        val bacclick = findViewById<TextView>(R.id.heading2)
        bacclick.setOnClickListener{
            val intent = Intent(this,bac::class.java)
            startActivity(intent)
        }

        val bssclick = findViewById<TextView>(R.id.heading4)
        bssclick.setOnClickListener{
            val intent = Intent(this,bss::class.java)
            startActivity(intent)
        }


        val blaclick = findViewById<TextView>(R.id.heading3)
        blaclick.setOnClickListener{
            val intent = Intent(this,bla::class.java)
            startActivity(intent)
        }

    }
}