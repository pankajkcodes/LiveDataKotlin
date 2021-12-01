package com.pankajkcodes.livedatakotlin

import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel(){
    private var _text = MutableLiveData<String>()
    private var _btnText = MutableLiveData<String>()

    val text : LiveData<String>
        get() = _text

    val btnText : LiveData<String>
    get() = _btnText

    init {
        _text.value = "Hey, My name is \n Pankaj"
        _btnText.value = "Tap !"
    }

    fun updateText() {
        _text.value = "Welcome, to our Community \npankajkcodes"
        _btnText.value = "Show !"
    }
}