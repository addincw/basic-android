package com.addincendekia.android_basic.viewbinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.addincendekia.android_basic.databinding.ActivityViewBindingBinding

/**
 * view binding merupakan salah satu alternatif sebagai pengganti syntethicx
 *
 * untuk implementasi view binding, perlu menambahkan script berikut pada build.gradle.app
 *  buildFeatures {
        viewBinding true
    }
 */
class ViewBindingActivity : AppCompatActivity() {
    lateinit var binding: ActivityViewBindingBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityViewBindingBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.tvTitle
    }
}