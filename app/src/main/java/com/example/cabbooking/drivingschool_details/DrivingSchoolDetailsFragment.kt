package com.example.cabbooking.drivingschool_details

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.cabbooking.R
import com.example.cabbooking.databinding.FragmentHireDriverDetailsBinding


class DrivingSchoolDetailsFragment : Fragment() {


    var _binding : FragmentHireDriverDetailsBinding? = null
    val  binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_driving_school_details, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        _binding = FragmentHireDriverDetailsBinding.bind(view)
    }

}