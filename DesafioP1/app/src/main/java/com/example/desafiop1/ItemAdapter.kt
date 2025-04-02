package com.example.desafiop1

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class ItemAdapter(private val listaItens: List<Item>) :
    RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {

    class ItemViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val imageView: ImageView = view.findViewById(R.id.imageView)
        val textViewNome: TextView = view.findViewById(R.id.textViewNome)
        val textViewValor: TextView = view.findViewById(R.id.textViewValor)
        val buttonVender: Button = view.findViewById(R.id.buttonVender)
        val buttonEditar: Button = view.findViewById(R.id.buttonEditar)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_card, parent, false)
        return ItemViewHolder(view)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = listaItens[position]
        holder.textViewNome.text = item.nome
        holder.textViewValor.text = "R$ ${item.valor}"

        Glide.with(holder.itemView.context)
            .load(item.urlImagem)
            .error(R.drawable.ic_launcher_foreground)
            .into(holder.imageView)
    }

    override fun getItemCount(): Int = listaItens.size
}