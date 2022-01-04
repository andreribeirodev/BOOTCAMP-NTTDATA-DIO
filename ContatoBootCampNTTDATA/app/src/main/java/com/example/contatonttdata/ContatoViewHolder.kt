package com.example.contatonttdata

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ContatoViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    private val textViewName = itemView.findViewById<TextView>(R.id.txtName)
    private val textViewPhone = itemView.findViewById<TextView>(R.id.txtPhone)


    fun bind(item: Contato){
        textViewName.text = item.name
        textViewPhone.text = item.number
    }

}