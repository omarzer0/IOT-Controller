package az.zero.iotcontroller.data.repository

import az.zero.iotcontroller.data.data_source.ApiService
import javax.inject.Inject

class MainRepositoryImpl @Inject constructor(
    private val api: ApiService
) {
    suspend fun getX(): String = api.getX()

}