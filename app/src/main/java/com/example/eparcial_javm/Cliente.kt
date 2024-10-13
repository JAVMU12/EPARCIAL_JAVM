package com.example.eparcial_javm

// Definir la clase de datos para el cliente
data class Cliente(
    val imagen: Int,    // Recurso de imagen (ID de un drawable)
    val marca: String,  // Marca del vehículo
    val modelo: String, // Modelo del vehículo
    val nombre: String, // Nombre del cliente
    val placa: String   // Placa del vehículo
)