package com.example.databaseintegration.apiservice

import com.example.databaseintegration.modeldata.DataSiswa
import retrofit2.http.GET

interface ServiceApiSiswa {
    @GET("bacaTeman.php")
    suspend fun  getSiswa(): List<DataSiswa>
}