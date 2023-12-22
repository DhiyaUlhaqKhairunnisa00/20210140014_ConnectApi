package com.example.connectapi.model

import kotlinx.serialization.Serializable

@Serializable
data class Kontak(
    val id: Int,
    val nama: String,
    val alamat: String,
    val telpon: String,
)