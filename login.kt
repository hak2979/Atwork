package com.talhajalil.smdproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val hello=findViewById<Button>(R.id.sign)
        hello.setOnClickListener {
            val intent= Intent(this,dateselection::class.java)
            startActivity(intent)
        }

    }
}