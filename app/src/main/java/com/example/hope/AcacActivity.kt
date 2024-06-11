package com.example.hope

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.hope.bcca


class AcacActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_acac)


        val textView = findViewById<TextView>(R.id.heading2)
        textView.setOnClickListener {
            val intent = Intent(this, bcca::class.java)
            startActivity(intent)
        }
    }
}