package com.elmorshdi.apptask.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.elmorshdi.apptask.R

class RecyclerviewAdapter(private val list: List<String>) : RecyclerView.Adapter<ItemViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        return ItemViewHolder(inflater, parent)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item: String = list[position]
        holder.bind(item)
    }

    override fun getItemCount(): Int = list.size

}

class ItemViewHolder(inflater: LayoutInflater, parent: ViewGroup) :
    RecyclerView.ViewHolder(inflater.inflate(R.layout.post_item, parent, false)) {
    private var mTitleView: TextView? = null


    init {
        mTitleView = itemView.findViewById(R.id.tv_name)
    }

    fun bind(item: String) {
        mTitleView?.text = item
    }

}