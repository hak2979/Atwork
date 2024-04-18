package com.example.atwork

import android.os.Bundle
import android.widget.LinearLayout
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Details : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_details)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val allButton = findViewById<TextView>(R.id.detail)
        allButton.setOnClickListener {
            // Replace the fragment and update UI
            supportFragmentManager.beginTransaction()
                .replace(R.id.fragment_changes, detail_fragments())
                .commit()

            // Update backgrounds and text color
            val detContainer = findViewById<LinearLayout>(R.id.det_con)
            detContainer.background = ContextCompat.getDrawable(this, R.drawable.left_round)
            allButton.setTextColor(ContextCompat.getColor(this, R.color.white))

            val revContainer = findViewById<LinearLayout>(R.id.rev_con)
            revContainer.background = ContextCompat.getDrawable(this, R.drawable.right_tab)
            findViewById<TextView>(R.id.review).setTextColor(ContextCompat.getColor(this, R.color.black))
        }

        val reviewButton = findViewById<TextView>(R.id.review)
        reviewButton.setOnClickListener {
            // Replace the fragment and update UI
            supportFragmentManager.beginTransaction()
                .replace(R.id.fragment_changes, review_frag())
                .commit()

            // Update backgrounds and text color
            val detContainer = findViewById<LinearLayout>(R.id.det_con)
            detContainer.background = ContextCompat.getDrawable(this, R.drawable.left_tab_unselect)
            findViewById<TextView>(R.id.detail).setTextColor(ContextCompat.getColor(this, R.color.black))

            val revContainer = findViewById<LinearLayout>(R.id.rev_con)
            revContainer.background = ContextCompat.getDrawable(this, R.drawable.right_tab_selected)
            reviewButton.setTextColor(ContextCompat.getColor(this, R.color.white))
        }
    }
}