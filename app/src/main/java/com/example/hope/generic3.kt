package com.example.hope

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.hope.R

class generic3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_generic3)

        val heading = intent.getStringExtra("mainheading")
        val image = intent.getIntExtra("mainimage", 0)
        val role = intent.getStringExtra("role")
        val secyname = intent.getStringExtra("secyname")
        val secyimage = intent.getIntExtra("secyimg", 0)
        val capname = intent.getStringExtra("capname")
        val capimg = intent.getIntExtra("capimg", 0)
        val vcapname = intent.getStringExtra("vcapname")
        val vcapimg = intent.getIntExtra("vcapimg", 0)
        val capname2= intent.getStringExtra("capname2")
        val capimg2 = intent.getIntExtra("capimg2", 0)
        val vcapname2 = intent.getStringExtra("vcapname2")
        val vcapimg2 = intent.getIntExtra("vcapimg2", 0)

        val headingTextView: TextView = findViewById(R.id.mainHeading)
        val roleofclub: TextView = findViewById(R.id.role)
        val imageView: ImageView = findViewById(R.id.mainlogo)
        val secy: TextView = findViewById(R.id.secyname)
        val secyImg: ImageView = findViewById(R.id.secyimg)
        val mc: TextView = findViewById(R.id.mencaptain)
        val mcImg: ImageView = findViewById(R.id.mencaptainimg)
        val mvc: TextView = findViewById(R.id.menvicecaptain)
        val mvcImg: ImageView = findViewById(R.id.menvicecaptainimg)
        val wc: TextView = findViewById(R.id.womencaptain)
        val wcImg: ImageView = findViewById(R.id.womencaptainimg)
        val wvc: TextView = findViewById(R.id.womenvicecaptai)
        val wvcImg: ImageView = findViewById(R.id.womenvicecaptainimg)

        headingTextView.text = heading
        roleofclub.text = role
        imageView.setImageResource(image)
        secy.text = secyname
        secyImg.setImageResource(secyimage)
        mc.text = capname
        mcImg.setImageResource(capimg)
        mvc.text = vcapname
        mvcImg.setImageResource(vcapimg)
        wc.text = capname2
        wcImg.setImageResource(capimg2)
        wvc.text = vcapname2
        wvcImg.setImageResource(vcapimg2)
    }
}
