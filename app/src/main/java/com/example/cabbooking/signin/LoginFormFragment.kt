package com.example.cabbooking.signin

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.cabbooking.R
import com.example.cabbooking.databinding.FragmentLoginFormBinding

class LoginFormFragment : Fragment() {
    var _binding: FragmentLoginFormBinding? = null
    val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentLoginFormBinding.inflate(layoutInflater, container, false)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.signupText.setOnClickListener {
            findNavController().navigate(R.id.action_loginFormFragment_to_signupFormFragment)
//lsdglksodkggitjf
        }
    }

}