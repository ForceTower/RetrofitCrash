package dev.forcetower.reightrofit

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import dev.forcetower.thing.library.usecase.MainUseCase
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val useCase: MainUseCase
) : ViewModel() {

    fun doThings() {
        viewModelScope.launch {
            val result = useCase.invoke()
            println(result)
        }
    }
}