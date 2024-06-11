package com.example.hope

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.hope.R

class GenericActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_generic)

        val heading = intent.getStringExtra("mainheading")
        val image = intent.getIntExtra("mainimage", 0)
        val role = intent.getStringExtra("role")
        val secyname = intent.getStringExtra("secyname")
        val secyimage = intent.getIntExtra("secyimg", 0)
        val joinsecyname1 = intent.getStringExtra("joinsecyname1")
        val joinsecyimage1 = intent.getIntExtra("joinsecyimg1", 0)
        val joinsecyname2 = intent.getStringExtra("joinsecyname2")
        val joinsecyimage2 = intent.getIntExtra("joinsecyimg2", 0)
        val joinsecyname3 = intent.getStringExtra("joinsecyname3")
        val joinsecyimage3 = intent.getIntExtra("joinsecyimg3", 0)

        val headingTextView: TextView = findViewById(R.id.mainHeading)
        val roleofclub: TextView= findViewById(R.id.role)
        val imageView: ImageView = findViewById(R.id.mainlogo)
        val secy: TextView = findViewById(R.id.secyname)
        val secyImg: ImageView = findViewById(R.id.secyimg)
        val joinSecy1: TextView = findViewById(R.id.joinsecyname1)
        val joinSecyImg1: ImageView = findViewById(R.id.joinsecyimg1)
        val joinSecy2: TextView = findViewById(R.id.joinsecyname2)
        val joinSecyImg2: ImageView = findViewById(R.id.joinsecyimg2)
        val joinSecy3: TextView = findViewById(R.id.joinsecyname3)
        val joinSecyImg3: ImageView = findViewById(R.id.joinsecyimg3)

        headingTextView.text = heading
        roleofclub.text = role
        imageView.setImageResource(image)
        secy.text = secyname
        secyImg.setImageResource(secyimage)
        joinSecy1.text = joinsecyname1
        joinSecyImg1.setImageResource(joinsecyimage1)
        joinSecy2.text = joinsecyname2
        joinSecyImg2.setImageResource(joinsecyimage2)
        joinSecy3.text = joinsecyname3
        joinSecyImg3.setImageResource(joinsecyimage3)
    }
}
