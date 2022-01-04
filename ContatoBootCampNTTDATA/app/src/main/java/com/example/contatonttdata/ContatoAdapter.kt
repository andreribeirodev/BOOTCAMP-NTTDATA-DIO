package com.example.contatonttdata

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class ContatoAdapter : RecyclerView.Adapter<ContatoViewHolder>() {

    private var items = listOf<Contato>()

    fun updateItems(newItems: List<Contato>) {
        items = newItems
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContatoViewHolder {
        val view = LayoutInflater
            .from(parent.context)
            .inflate(R.layout.item_contato, parent, false)
        return ContatoViewHolder(view)
    }

    override fun onBindViewHolder(holder: ContatoViewHolder, position: Int) {
        holder.bind(items[position])
    }

    override fun getItemCount(): Int {
        return items.size
    }
}