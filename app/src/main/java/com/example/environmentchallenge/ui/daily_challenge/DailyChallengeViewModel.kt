package com.example.environmentchallenge.ui.daily_challenge

import android.graphics.Color
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class DailyChallengeViewModel : ViewModel() {
    private val _text = MutableLiveData<String>().apply {
        value = "This is daily challenge Fragment"
    }
    val text: LiveData<String> = _text
    var doneButton:Boolean=true
    var color:Int= Color.WHITE



    fun isDone():Boolean
    {
        doneButton=false
        color= Color.LTGRAY
        return doneButton
    }

    fun notDone():Boolean
    {
        doneButton=true
        color= Color.WHITE
        return doneButton
    }
}