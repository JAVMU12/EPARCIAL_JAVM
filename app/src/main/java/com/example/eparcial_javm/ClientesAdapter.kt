package com.example.eparcial_javm

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ClientesAdapter(private val clientes: List<Cliente>) : RecyclerView.Adapter<ClientesAdapter.ClientesViewHolder>() {

    class ClientesViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imagen: ImageView = itemView.findViewById(R.id.ivClienteImagen)
        val marca: TextView = itemView.findViewById(R.id.tvMarca)
        val modelo: TextView = itemView.findViewById(R.id.tvModelo)
        val nombre: TextView = itemView.findViewById(R.id.tvNombre)
        val placa: TextView = itemView.findViewById(R.id.tvPlaca)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ClientesViewHolder {

        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_cliente, parent, false)
        return ClientesViewHolder(view)
    }

    override fun onBindViewHolder(holder: ClientesViewHolder, position: Int) {
        val cliente = clientes[position]


        holder.imagen.setImageResource(cliente.imagen)
        holder.marca.text = cliente.marca
        holder.modelo.text = cliente.modelo
        holder.nombre.text = cliente.nombre
        holder.placa.text = cliente.placa
    }

    override fun getItemCount(): Int {
        return clientes.size
    }
}
