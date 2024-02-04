package com.oybekdev.navigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.oybekdev.navigation.databinding.FragmentWelcomeBinding

class WelcomeFragment : Fragment() {

    private lateinit var binding:FragmentWelcomeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentWelcomeBinding.inflate(inflater,container,false)

        binding.gotoLogin.setOnClickListener {
            it.findNavController().navigate(R.id.action_welcomeFragment_to_loginFragment)
        }
        binding.gotoSignup.setOnClickListener {
            it.findNavController().navigate(R.id.action_welcomeFragment_to_signUpFragment)
        }
        return binding.root
    }


}