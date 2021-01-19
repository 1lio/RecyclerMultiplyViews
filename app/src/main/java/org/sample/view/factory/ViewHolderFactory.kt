package org.sample.view.factory

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.widget.AppCompatImageView
import androidx.recyclerview.widget.RecyclerView
import org.sample.R
import org.sample.view.rows.Row

object ViewHolderFactory {

    class TextViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val textView: TextView = view.findViewById(R.id.textView1)
    }

    class ImageViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val imgView: AppCompatImageView = view.findViewById(R.id.imageView1)
    }

    class ImageTextViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val textView: TextView = view.findViewById(R.id.textView2)
        val imgView: AppCompatImageView = view.findViewById(R.id.imageView2)
    }

    fun create(parent: ViewGroup, itemType: Int): RecyclerView.ViewHolder {

        return when (itemType) {
            Row.TEXT -> TextViewHolder(R.layout.card_1.inflate(parent))
            Row.IMAGE -> ImageViewHolder(R.layout.card_2.inflate(parent))
            Row.IMAGE_AND_TEXT -> ImageTextViewHolder(R.layout.card_3.inflate(parent))

            else -> TextViewHolder(R.layout.card_1.inflate(parent))
        }
    }

    private fun Int.inflate(parent: ViewGroup) =
        LayoutInflater.from(parent.context).inflate(this, parent, false)

}