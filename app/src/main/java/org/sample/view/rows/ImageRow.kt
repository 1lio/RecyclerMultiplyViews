package org.sample.view.rows

import androidx.recyclerview.widget.RecyclerView
import org.sample.view.factory.ViewHolderFactory

class ImageRow(private val imgSrc: Int) : Row {

    override fun getItemType(): Int = Row.IMAGE

    override fun onBindViewHolder(viewHolder: RecyclerView.ViewHolder) {
        (viewHolder as ViewHolderFactory.ImageViewHolder).imgView.setImageResource(imgSrc)
    }
}