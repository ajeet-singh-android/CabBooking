package com.example.cabbooking.hire_driver_details

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.cabbooking.R
import com.example.cabbooking.databinding.FragmentHireDriverDetailsBinding

class HireDriverDetailsFragment : Fragment() {


    var _binding : FragmentHireDriverDetailsBinding? = null
    val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_hire_driver_details, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        _binding = FragmentHireDriverDetailsBinding.bind(view)
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

}