package com.example.atwork

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ReviewAdapter(
    private val names: Array<String>,
    private val ratings: Array<String>,
    private val reviews: Array<String>
) : RecyclerView.Adapter<ReviewAdapter.ReviewViewHolder>() {

    class ReviewViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val nameTextView: TextView = view.findViewById(R.id.name)
        val ratingTextView: TextView = view.findViewById(R.id.rating)
        val reviewTextView: TextView = view.findViewById(R.id.review)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ReviewViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.review, parent, false)
        return ReviewViewHolder(view)
    }

    override fun onBindViewHolder(holder: ReviewViewHolder, position: Int) {
        holder.nameTextView.text = names[position]
        holder.ratingTextView.text = ratings[position]
        holder.reviewTextView.text = reviews[position]
    }

    override fun getItemCount(): Int {
        return names.size
    }
}