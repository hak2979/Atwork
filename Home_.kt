package com.example.atwork

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.viewpager2.widget.ViewPager2

class Home_ : AppCompatActivity() {
    val imageResIds = listOf(
        R.drawable.rectangle_18,
        R.drawable.rectangle_18,
        R.drawable.rectangle_18
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_home)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val viewPager = findViewById<ViewPager2>(R.id.viewPager)
        val adapter = CarouselAdapter(imageResIds)
        viewPager.adapter = adapter
        val handler = Handler(Looper.getMainLooper())
        val autoScrollRunnable = object : Runnable {
            override fun run() {
                // Calculate next page
                val currentItem = viewPager.currentItem
                val nextItem = (currentItem + 1) % adapter.itemCount

                // Move to next page
                viewPager.currentItem = nextItem

                // Repeat after 3 seconds
                handler.postDelayed(this, 3000)
            }
        }
        handler.postDelayed(autoScrollRunnable, 3000)

    }
    fun booking_s(view: View){
        val intent= Intent(this,Freelance_::class.java)
        startActivity(intent)
    }
    fun seller_s(view: View){
        val intent=Intent(this,All_seller::class.java)
        startActivity(intent)
    }
}