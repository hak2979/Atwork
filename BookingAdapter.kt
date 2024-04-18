package com.example.atwork

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class BookingAdapter(
    private val names: Array<String>,
    private val services: Array<String>,
    private val statuses: Array<String>
) : RecyclerView.Adapter<BookingViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BookingViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.booking_gig, parent, false)
        return BookingViewHolder(view)
    }

    override fun onBindViewHolder(holder: BookingViewHolder, position: Int) {
        if (position >= names.size || position >= services.size || position >= statuses.size) {
            // Log an error or handle the out-of-bounds access gracefully
            Log.e("BookingAdapter", "Index out of bounds: position $position, name size: ${names.size}, service size: ${services.size}, stat size: ${statuses.size}")
            return // Return early to avoid using an invalid index
        }
        // Otherwise, proceed with binding the data to the view holder
        holder.nameTextView.text = names[position]
        holder.serviceTextView.text = services[position]
        holder.statusTextView.text = statuses[position]

        val layoutParams = holder.itemView.layoutParams as ViewGroup.MarginLayoutParams

        // Set top and bottom margins
        val verticalMargin = 17 // Set desired vertical margin in pixels
        layoutParams.topMargin = verticalMargin
        layoutParams.bottomMargin = verticalMargin

        // Apply the layout parameters back to the view
        holder.itemView.layoutParams = layoutParams
    }

    override fun getItemCount(): Int {
        return names.size
    }
}