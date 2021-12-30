package az.zero.iotcontroller.presentation.main.home

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

    fun getX() {
        viewModelScope.launch {
            val s = repository.getX()
        }
    }
}

