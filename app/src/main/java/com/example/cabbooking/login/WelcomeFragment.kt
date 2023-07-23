package com.example.cabbooking.login

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.cabbooking.Authentication.AuthActivity
import com.example.cabbooking.R

import com.example.cabbooking.databinding.FragmentWelcomeBinding


class WelcomeFragment : Fragment() {

    var _binding: FragmentWelcomeBinding? = null
    val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentWelcomeBinding.inflate(layoutInflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.loginbutton.setOnClickListener {
            (requireActivity() as AuthActivity).gotoPage(R.id.loginFormFragment)
        }

        binding.createaccountbutton.setOnClickListener {
            (requireActivity() as AuthActivity).gotoPage(R.id.signupFormFragment)
        }

    }


    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

}