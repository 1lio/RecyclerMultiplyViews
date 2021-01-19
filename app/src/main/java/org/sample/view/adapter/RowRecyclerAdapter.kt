package org.sample.view.adapter

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import org.sample.view.factory.ViewHolderFactory
import org.sample.view.rows.Row

class RowRecyclerAdapter(private val list: List<Row>) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun getItemViewType(position: Int): Int = list[position].getItemType()

    override fun onBindViewHolder(viewHolder: RecyclerView.ViewHolder, pos: Int) {
        list[pos].onBindViewHolder(viewHolder)
    }

    override fun getItemCount() = list.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        ViewHolderFactory.create(parent, viewType)
}
