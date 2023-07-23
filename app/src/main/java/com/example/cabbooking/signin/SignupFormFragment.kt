package com.example.cabbooking.signin

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.cabbooking.R
import com.example.cabbooking.databinding.HomeCarItemsBinding
import com.example.cabbooking.databinding.HomeHireDriverItemsBinding
import com.example.cabbooking.databinding.SliderCarItemsBinding

class SignupFormFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_signup_form, container, false)
    }




}