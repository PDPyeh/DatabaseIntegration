package com.example.databaseintegration.modeldata

import kotlinx.serialization.Serializable

@Serializable
data class  DataSiswa(
    val id: Int,
    val nama : String,
    val alamat : String,
    val telpon : String
)