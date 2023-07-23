package com.example.cabbooking.otp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.cabbooking.Authentication.AuthActivity
import com.example.cabbooking.R
import com.example.cabbooking.databinding.FragmentOTPBinding

class OTPFragment : Fragment() {

    var _binding : FragmentOTPBinding? = null
    val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_o_t_p, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        _binding = FragmentOTPBinding.bind(view)


        binding.submit.setOnClickListener {
            (requireActivity() as AuthActivity).gotoPage(R.id.resetPasswordFragment)
        }

    }

}