package com.addincendekia.android_basic.fragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.addincendekia.android_basic.R

class StaticFragmentActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_static_fragment)
    }
}