package com.example.viewmodelcomponent_48

import androidx.lifecycle.ViewModel

class MainActivityViewModel:ViewModel() {

    var number = 0

    fun addNumber(){
        number++
    }

    override fun onCleared() {
        super.onCleared()
    }
}