package com.talhajalil.smdproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class signup : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        val hello=findViewById<Button>(R.id.login)
        hello.setOnClickListener {
            val intent= Intent(this,signup1::class.java)
            startActivity(intent)
        }

    }
}