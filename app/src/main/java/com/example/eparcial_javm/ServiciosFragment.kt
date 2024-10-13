package com.example.eparcial_javm

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.fragment.app.Fragment

class ServiciosFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_servicios, container, false)


        val listViewServicios = view.findViewById<ListView>(R.id.listViewServicios)


        val servicios = listOf("Cambio de aceite", "Revisión de frenos", "Alineación de ruedas", "Cambio de neumáticos")


        val adapter = ArrayAdapter(requireContext(), android.R.layout.simple_list_item_1, servicios)


        listViewServicios.adapter = adapter

        return view
    }
}