package com.example.cabbooking.car_details

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.cabbooking.R
import com.example.cabbooking.databinding.FragmentCarDetailsFragmentBinding


class CarDetailsFragmentFragment : Fragment() {


    var _binding : FragmentCarDetailsFragmentBinding? = null
    val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_car_details_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentCarDetailsFragmentBinding.bind(view)
    }


}