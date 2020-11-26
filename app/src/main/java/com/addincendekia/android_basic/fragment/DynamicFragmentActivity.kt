package com.addincendekia.android_basic.fragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.addincendekia.android_basic.R
import com.addincendekia.android_basic.fragment.fragments.FirstFragment
import com.addincendekia.android_basic.fragment.fragments.SecondFragment

class DynamicFragmentActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dynamic_fragment)

        val firstFragment = FirstFragment()
        val secondFragment = SecondFragment()

        supportFragmentManager.beginTransaction().apply {
            replace(R.id.flFragment, firstFragment)
            commit()
        }

        findViewById<Button>(R.id.btnFirstFragment).setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.flFragment, firstFragment)
                commit()
            }
        }
        findViewById<Button>(R.id.btnSecondFragment).setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.flFragment, secondFragment)
                commit()
            }
        }
    }
}