package com.example.eparcial_javm

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ClientesFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_clientes, container, false)

        // Lista de clientes
        val clientes = listOf(
            Cliente(R.drawable.ic_launcher_foreground, "Toyota", "Corolla", "Juan Pérez", "ABC123"),
            Cliente(R.drawable.ic_launcher_foreground, "Honda", "Civic", "María García", "XYZ987")
        )

        val recyclerView = view.findViewById<RecyclerView>(R.id.recyclerViewClientes)
        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        recyclerView.adapter = ClientesAdapter(clientes)

        return view
    }
}