package yuma140902.android.composecounter_mutablestate.screen

sealed class MainEvent
object OnClickCountUpEvent : MainEvent()
object OnClickResetEvent : MainEvent()