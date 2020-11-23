package com.addincendekia.android_basic.viewmodel

import androidx.lifecycle.ViewModel

class ViewModelActivityVM: ViewModel() {
    var number = 0

    fun incrementNumber() = number++
}