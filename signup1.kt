package com.talhajalil.smdproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Spinner

class signup1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup1)
        val spinnerCity = findViewById<Spinner>(R.id.editTextww)
        val cities = arrayOf("Select City", "Gujranwala", "Lahore", "Karachi", "Sialkot", "Islamabad")
        val arrayAdapter1 = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, cities)
        spinnerCity.adapter = arrayAdapter1
    }
}