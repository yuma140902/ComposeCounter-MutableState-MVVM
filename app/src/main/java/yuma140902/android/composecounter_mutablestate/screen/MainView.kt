package yuma140902.android.composecounter_mutablestate.screen

import android.util.Log
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@Composable
fun MainView(viewModel: MainViewModel) {
    Log.d("MainView", "update")
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        CounterDisplay(viewModel = viewModel)
        CountUpButton(viewModel = viewModel)
        ResetButton(viewModel = viewModel)
    }
}

@Composable
fun CounterDisplay(viewModel: MainViewModel) {
    Log.d("CounterDisplay", "update")
    Text(text = viewModel.state.counter.toString())
}

@Composable
fun CountUpButton(viewModel: MainViewModel) {
    Log.d("CountUp", "update")
    Button(onClick = { viewModel.onEvent(OnClickCountUpEvent) }) {
        Text(text = "Count Up")
    }
}

@Composable
fun ResetButton(viewModel: MainViewModel) {
    Log.d("Reset", "update")
    Button(onClick = { viewModel.onEvent(OnClickResetEvent) }) {
        Text(text = "Reset")
    }
}