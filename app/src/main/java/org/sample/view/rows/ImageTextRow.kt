package org.sample.view.rows

import androidx.recyclerview.widget.RecyclerView
import org.sample.view.factory.ViewHolderFactory

class ImageTextRow(
    private val text: String,
    private val imgRes: Int
) : Row {

    override fun getItemType(): Int = Row.IMAGE_AND_TEXT

    override fun onBindViewHolder(viewHolder: RecyclerView.ViewHolder) {

        val holder = (viewHolder as ViewHolderFactory.ImageTextViewHolder)

        holder.textView.text = text
        holder.imgView.setImageResource(imgRes)
    }
}