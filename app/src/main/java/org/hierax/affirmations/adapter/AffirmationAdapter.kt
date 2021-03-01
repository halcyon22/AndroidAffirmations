package org.hierax.affirmations.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import org.hierax.affirmations.R
import org.hierax.affirmations.model.Affirmation

class AffirmationAdapter(
    private val context: Context,
    private val dataset: List<Affirmation>
) : RecyclerView.Adapter<AffirmationAdapter.AffirmationViewHolder>() {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): AffirmationViewHolder {
        val affirmationCardLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.affirmation_card, parent, false)
        return AffirmationViewHolder(affirmationCardLayout)
    }

    override fun onBindViewHolder(
        holder: AffirmationViewHolder,
        position: Int
    ) {
        val affirmation = dataset[position]
        holder.textView.text = context.resources.getString(affirmation.stringResourceId)
        holder.imageView.setImageResource(affirmation.imageResourceId)
    }

    override fun getItemCount(): Int {
        return dataset.size
    }

    class AffirmationViewHolder(affirmationCardView: View) :
        RecyclerView.ViewHolder(affirmationCardView) {
        val textView: TextView = affirmationCardView.findViewById(R.id.affirmation_card_text)
        val imageView: ImageView = affirmationCardView.findViewById(R.id.affirmation_image)
    }

}