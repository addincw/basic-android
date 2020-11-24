package com.addincendekia.android_basic.livedata

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.addincendekia.android_basic.databinding.ActivityLiveDataBinding

/**
 * pada build.gradle.app membutuhkan implementasi dari
 * implementation "android.arch.lifecycle:extensions:1.1.1"
 * annotationProcessor "android.arch.lifecycle:compiler:1.1.1"
 */

class LiveDataActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLiveDataBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLiveDataBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val viewModel = ViewModelProvider(this).get(LiveDataViewModel::class.java)

        viewModel.counter().observe(this, Observer { timeLeft ->
            binding.tvCountTimer.text = timeLeft.toString()
        })
        viewModel.finished().observe(this, Observer { isFinish ->
            if(isFinish) Toast.makeText(this, "countdown is finish", Toast.LENGTH_SHORT).show()
        })

        binding.btnStartTimer.setOnClickListener {
            if (binding.etTimerDuration.text.toString().isEmpty() || binding.etTimerDuration.text.toString().toInt() <= 0){
                Toast.makeText(this, "timer duration must be above 0 seconds", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            viewModel.timerDuration.value = binding.etTimerDuration.text.toString().toInt() * 1000L
            viewModel.startTimer()
        }
        binding.btnStopTimer.setOnClickListener {
            viewModel.stopTimer()
        }
    }
}