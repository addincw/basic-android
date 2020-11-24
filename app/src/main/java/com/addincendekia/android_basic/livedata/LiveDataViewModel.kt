package com.addincendekia.android_basic.livedata

import android.os.CountDownTimer
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class LiveDataViewModel : ViewModel() {
    private lateinit var timer: CountDownTimer
    private val counter = MutableLiveData<Int>()
    private val finished = MutableLiveData<Boolean>()

    val timerDuration = MutableLiveData<Long>()

    fun counter(): LiveData<Int> = counter
    fun finished(): LiveData<Boolean> = finished
    fun startTimer() {
        val countDownInterval = 1000L

        timer = object: CountDownTimer(timerDuration.value!!, countDownInterval){
            override fun onTick(millisUntilFinished: Long) {
                val timeLeft = millisUntilFinished/countDownInterval
                counter.value = timeLeft.toInt()
            }

            override fun onFinish() {
                finished.value = true
            }

        }.start()
    }
    fun stopTimer() {
        timer.cancel()
    }
}