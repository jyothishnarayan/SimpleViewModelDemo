package com.example.simpleviewmodelchallenge

import androidx.lifecycle.ViewModel

class MainActivityViewModel:ViewModel() {

    private var count = 0

    fun getCount():Int{
        return count
    }
    fun upDateCount(value:Int):Unit{
        count+=value
    }
}