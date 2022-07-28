package yuma140902.android.composecounter_mutablestate.screen

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    private val mutState = mutableStateOf(MainModel.initialValue)
    val state by mutState

    fun onEvent(event: MainEvent) {
        when(event) {
            OnClickCountUpEvent -> countUp()
            OnClickResetEvent -> resetCounter()
        }
    }

    private fun countUp() {
        mutState.value = state.copy(counter = state.counter + 1)
    }

    private fun resetCounter() {
        mutState.value = state.copy(counter = 0)
    }
}