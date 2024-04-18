package com.example.atwork

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class BookingViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    val nameTextView: TextView = view.findViewById(R.id.name)
    val serviceTextView = view.findViewById<TextView>(R.id.service)
    val statusTextView: TextView = view.findViewById(R.id.stat)
}