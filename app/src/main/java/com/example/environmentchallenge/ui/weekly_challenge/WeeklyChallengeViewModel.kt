
package com.example.environmentchallenge.ui.weekly_challenge

import android.graphics.Color
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class WeeklyChallengeViewModel : ViewModel() {
    // TODO: Implement the ViewModel
    private val _text = MutableLiveData<String>().apply {
        value = "This is Weekly Challenge Fragment"
    }

    val text: LiveData<String> = _text
    var color:Int= Color.WHITE
    var count = 0
    var doneButton:Boolean=true
    fun addProgress(): Int {
        count += 1
        return count
    }

    fun getCurrentProgess(): Int {
        return count;
    }

    fun getText(): String {
        return count.toString() + "/" + 7

    }

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