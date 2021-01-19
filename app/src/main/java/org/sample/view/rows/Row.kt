package org.sample.view.rows

import androidx.recyclerview.widget.RecyclerView

interface Row {

    companion object {

        const val TEXT: Int = 0
        const val IMAGE: Int = 1
        const val IMAGE_AND_TEXT: Int = 2

    }

    fun getItemType(): Int

    fun onBindViewHolder(viewHolder: RecyclerView.ViewHolder)

}