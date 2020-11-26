package com.addincendekia.android_basic.botomnavigation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.addincendekia.android_basic.R
import com.addincendekia.android_basic.bottomnavigation.fragments.SecondFragment
import com.addincendekia.android_basic.bottomnavigation.fragments.ThirdFragment
import com.addincendekia.android_basic.bottomnavigation.fragments.FirstFragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class BottomNavigationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bottom_navigation)

        val firstFragment = FirstFragment()
        val secondFragment = SecondFragment()
        val thirdFragment = ThirdFragment()

        setCurrentFragment(firstFragment)

        findViewById<BottomNavigationView>(R.id.bottomNavigationView)
            .setOnNavigationItemSelectedListener {
                when(it.itemId){
                    R.id.bmiHome -> setCurrentFragment(firstFragment)
                    R.id.bmiMessage -> setCurrentFragment(secondFragment)
                    R.id.bmiProfile -> setCurrentFragment(thirdFragment)
                }
                true
            }
    }

    private fun setCurrentFragment(firstFragment: Fragment) {
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.flFragment, firstFragment)
            commit()
        }
    }
}