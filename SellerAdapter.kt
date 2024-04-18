package com.example.atwork
import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView

class SellerAdapter(
    private val context: Context, // Pass the context to the adapter
    private val names: Array<String>,
    private val services: Array<String>,
    private val ratings: Array<String>
) : RecyclerView.Adapter<SellerAdapter.SellerViewHolder>() {

    // Inner ViewHolder class
    class SellerViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val nameTextView: TextView = view.findViewById(R.id.name)
        val serviceTextView: TextView = view.findViewById(R.id.service)
        val ratingTextView: TextView = view.findViewById(R.id.rating)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SellerViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.gigs_seller_, parent, false)
        return SellerViewHolder(view)
    }

    override fun onBindViewHolder(holder: SellerViewHolder, position: Int) {
        holder.nameTextView.text = names[position]
        holder.serviceTextView.text = services[position]
        holder.ratingTextView.text = ratings[position]

        // Set top and bottom margins
        val layoutParams = holder.itemView.layoutParams as ViewGroup.MarginLayoutParams
        val verticalMargin = 17 // Set desired vertical margin in pixels
        layoutParams.topMargin = verticalMargin
        layoutParams.bottomMargin = verticalMargin
        holder.itemView.layoutParams = layoutParams

        // Set the click listener
        holder.itemView.setOnClickListener {
            val intent = Intent(context, Details::class.java)
            context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return names.size
    }
}