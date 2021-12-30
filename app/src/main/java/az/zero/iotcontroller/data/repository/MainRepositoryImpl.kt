package az.zero.iotcontroller.data.repository

import az.zero.iotcontroller.data.data_source.ApiService
import javax.inject.Inject

class MainRepositoryImpl @Inject constructor(
    private val api: ApiService
) {
    suspend fun motorON() = api.motorON()
    suspend fun motorOFF() = api.motorOFF()
    suspend fun motorBack() = api.motorBack()
    suspend fun motorRight() = api.motorRight()
    suspend fun motorLeft() = api.motorLeft()
}