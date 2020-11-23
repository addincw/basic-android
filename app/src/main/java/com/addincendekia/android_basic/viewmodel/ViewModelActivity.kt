package com.addincendekia.android_basic.viewmodel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.addincendekia.android_basic.databinding.ActivityViewModelBinding

/**
 * view model dapat di ibaratkan state, mempertahankan nilai saat lifecycle pada activity / fragment
 * berubah
 *
 * memisahkan data dengan controller
 *
 * butuh implementasi berikut di build.gradle.app
 * implementation "androidx.lifecycle:lifecycle-viewmodel-ktx:2.2.0"
 */
class ViewModelActivity : AppCompatActivity() {
    lateinit var binding: ActivityViewModelBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityViewModelBinding.inflate(layoutInflater)
        setContentView(binding.root)

////        normal
//        var number = 0
//        binding.tvCount.text = number.toString()
//
//        binding.btnCount.setOnClickListener {
//            number++
//            binding.tvCount.text = number.toString()
//        }

////      view model
        var viewModel = ViewModelProvider(this).get(ViewModelActivityVM::class.java)
        binding.tvCount.text = viewModel.number.toString()

        binding.btnCount.setOnClickListener {
            viewModel.incrementNumber()
            binding.tvCount.text = viewModel.number.toString()
        }

    }
}