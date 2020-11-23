package com.addincendekia.android_basic.viewmodel

import androidx.lifecycle.ViewModel

class ViewModelActivityVM(addMultiple: Int): ViewModel() {
    private var multiple = addMultiple
    var number = 0

    fun incrementNumber() = number++
    fun incrementNumberByMultiple() {
        number += multiple
    }
}