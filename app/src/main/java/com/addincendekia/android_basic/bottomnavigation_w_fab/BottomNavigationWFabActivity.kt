package com.addincendekia.android_basic.bottomnavigation_w_fab

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.addincendekia.android_basic.R
import com.addincendekia.android_basic.databinding.ActivityBottomNavigationWFabBinding

class BottomNavigationWFabActivity : AppCompatActivity() {
    private lateinit var binding: ActivityBottomNavigationWFabBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBottomNavigationWFabBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.bottomNavigationView.apply {
            background = null
            menu.getItem(2).isEnabled = false
        }
    }
}