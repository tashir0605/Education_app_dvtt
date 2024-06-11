package com.example.hope

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.hope.R

class generic2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_generic2)

        val heading = intent.getStringExtra("mainheading")
        val image = intent.getIntExtra("mainimage", 0)
        val role = intent.getStringExtra("role")
        val coordinator1 = intent.getStringExtra("codname1")
        val coordinator1img = intent.getIntExtra("codimg1", 0)
        val coordinator2 = intent.getStringExtra("codname2")
        val coordinator2img = intent.getIntExtra("codimg2", 0)

        val headingTextView: TextView = findViewById(R.id.headingofbcca)
        val roleofclub: TextView = findViewById(R.id.roleofbcca)
        val imageView: ImageView = findViewById(R.id.logoofbcca)
        val cod: TextView = findViewById(R.id.coordinator1name)
        val codImg: ImageView = findViewById(R.id.coordinator1)
        val cod2: TextView = findViewById(R.id.coordinator2name)
        val codImg2: ImageView = findViewById(R.id.coordinator2)

        headingTextView.text = heading
        roleofclub.text = role
        imageView.setImageResource(image)
        cod.text = coordinator1
        codImg.setImageResource(coordinator1img)
        cod2.text = coordinator2
        codImg2.setImageResource(coordinator2img)
    }
}
