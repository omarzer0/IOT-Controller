package az.zero.iotcontroller.data.data_source

import retrofit2.http.GET

interface ApiService {

    @GET("")
    suspend fun getX(): String
}