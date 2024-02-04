package com.oybekdev.livedata

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MyViewModel:ViewModel() {
    private val countLivaData = MutableLiveData<Int>()

    init {
        countLivaData.value = 0
    }

    val counterLiveData:LiveData<Int>
        get() = countLivaData

    fun incrementCounter(){
        countLivaData.value = (countLivaData.value ?: 0)+1
    }
}