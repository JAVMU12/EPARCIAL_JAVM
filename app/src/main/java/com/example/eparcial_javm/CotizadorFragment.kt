package com.example.eparcial_javm

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment

class CotizadorFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_cotizador, container, false)

        val etCosto = view.findViewById<EditText>(R.id.etCosto)
        val etCantidad = view.findViewById<EditText>(R.id.etCantidad)
        val btnCalcular = view.findViewById<Button>(R.id.btnCalcular)
        val tvResultado = view.findViewById<TextView>(R.id.tvResultado)

        btnCalcular.setOnClickListener {
            val costoText = etCosto.text.toString()
            val cantidadText = etCantidad.text.toString()

            if (costoText.isNotEmpty() && cantidadText.isNotEmpty()) {
                val costo = costoText.toDouble()
                val cantidad = cantidadText.toInt()

                val total = costo * cantidad

                tvResultado.text = "Total: $$total"
            } else {
                Toast.makeText(requireContext(), "Por favor, ingresa todos los valores", Toast.LENGTH_SHORT).show()
            }
        }

        return view
    }
}