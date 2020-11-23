package com.addincendekia.android_basic.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

@Suppress("UNCHECKED_CAST")
class ViewModelActivityVMFactory(private var addNumber: Int): ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(ViewModelActivityVM::class.java)){
            return ViewModelActivityVM(addNumber) as T
        }
        throw IllegalArgumentException("view model doesnt exit")
    }
}