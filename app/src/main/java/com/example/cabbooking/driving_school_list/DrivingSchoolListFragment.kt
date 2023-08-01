package com.example.cabbooking.driving_school_list

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.cabbooking.MainActivity
import com.example.cabbooking.R
import com.example.cabbooking.databinding.CarListItemsBinding
import com.example.cabbooking.databinding.FragmentDrivingSchoolListBinding


class DrivingSchoolListFragment : Fragment() {


    var _binding : FragmentDrivingSchoolListBinding ? = null
    val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_driving_school_list, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        _binding = FragmentDrivingSchoolListBinding.bind(view)

        binding.drivingSchoolRecyclerview.adapter = HireDeiverListAdapter(object : HireDeiverListAdapter.clickListener {
            override fun onClicked(position: Int) {
                (requireActivity() as MainActivity).gotoPage(R.id.carDetailsFragmentFragment)
            }

        })
    }


    class HireDeiverListAdapter(val listener : clickListener) : RecyclerView.Adapter<HireDeiverListAdapter.HireDeiverDataHolder>() {
        class HireDeiverDataHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
            val binding = CarListItemsBinding.bind(itemView)
        }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HireDeiverDataHolder {
            return  HireDeiverDataHolder(LayoutInflater.from(parent.context).inflate(R.layout.fragment_driving_school_list,parent,false))
        }

        override fun getItemCount(): Int {
            return  10
        }

        override fun onBindViewHolder(holder: HireDeiverDataHolder, position: Int) {
            holder.itemView.setOnClickListener {
                listener.onClicked(position)
            }
        }


        interface  clickListener{
            fun onClicked(position: Int)
        }
    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}