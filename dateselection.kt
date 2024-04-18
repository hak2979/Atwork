package com.talhajalil.smdproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class dateselection : AppCompatActivity() {
    private var currentNumber = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dateselection)

       val numberTextView = findViewById<TextView>(R.id.textView16)
        val plusButton = findViewById<ImageView>(R.id.imageView14)
        val minusButton = findViewById<ImageView>(R.id.imageView14a)

        plusButton.setOnClickListener {
            currentNumber--
            updateNumber()
        }
        minusButton.setOnClickListener {
            currentNumber++
            updateNumber()
        }
    }

    private fun updateNumber() {
        val numberTextView = findViewById<TextView>(R.id.textView16)
        numberTextView.text = currentNumber.toString()
    }
}