package az.zero.iotcontroller.data.data_source

import retrofit2.http.GET

interface ApiService {

    @GET("motorON")
    suspend fun motorON():Unit

    @GET("motorOFF")
    suspend fun motorOFF():Unit

    @GET("motorBack")
    suspend fun motorBack():Unit

    @GET("motorRight")
    suspend fun motorRight():Unit

    @GET("motorLeft")
    suspend fun motorLeft():Unit

}