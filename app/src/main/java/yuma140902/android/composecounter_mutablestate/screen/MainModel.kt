package yuma140902.android.composecounter_mutablestate.screen

data class MainModel(
    val counter: Int
){
    companion object{
        val initialValue = MainModel(counter = 0)
    }
}