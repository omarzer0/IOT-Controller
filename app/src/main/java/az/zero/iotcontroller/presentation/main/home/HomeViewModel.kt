package az.zero.iotcontroller.presentation.main.home

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import az.zero.iotcontroller.data.repository.MainRepositoryImpl
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    private val repository: MainRepositoryImpl
) : ViewModel() {

    fun motorON() = viewModelScope.launch {
        handleCalls {
            repository.motorON()
        }
    }

    fun motorOFF() = viewModelScope.launch {
        handleCalls {
            repository.motorOFF()
        }
    }

    fun motorBack() = viewModelScope.launch {
        handleCalls {
            repository.motorBack()
        }
    }

    fun motorRight() = viewModelScope.launch {
        handleCalls {
            repository.motorRight()
        }
    }

    fun motorOLeft() = viewModelScope.launch {
        handleCalls {
            repository.motorLeft()
        }
    }

    // handle network errors
    private fun handleCalls(action: suspend () -> Unit) {
        viewModelScope.launch {
            try {
                action()
            } catch (e: Exception) {
                Log.e("TAG", "handleCalls: ${e.localizedMessage}")
            }
        }
    }
}



