package com.addincendekia.android_basic.viewbinding


import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.addincendekia.android_basic.R
import com.addincendekia.android_basic.databinding.FragmentViewBindingBinding

class ViewBindingFragment : Fragment(R.layout.fragment_view_binding) {
    lateinit var binding: FragmentViewBindingBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        FragmentViewBindingBinding.bind(view)
        binding.tvFrTitle
    }
}