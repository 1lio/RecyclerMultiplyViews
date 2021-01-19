package org.sample.view.rows

import androidx.recyclerview.widget.RecyclerView
import org.sample.view.factory.ViewHolderFactory

class TextRow(private val text: String) : Row {

    override fun getItemType(): Int = Row.TEXT

    override fun onBindViewHolder(viewHolder: RecyclerView.ViewHolder) {
        (viewHolder as ViewHolderFactory.TextViewHolder).textView.text = text
    }
}