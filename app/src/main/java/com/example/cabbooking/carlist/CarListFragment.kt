package com.example.cabbooking.carlist

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.cabbooking.MainActivity
import com.example.cabbooking.R
import com.example.cabbooking.databinding.CarListItemsBinding
import com.example.cabbooking.databinding.FragmentCarListBinding
import com.example.cabbooking.databinding.FuelStationItemsBinding

class CarListFragment : Fragment() {

    var _binding : FragmentCarListBinding? = null
    val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_car_list, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        _binding = FragmentCarListBinding.bind(view)


        binding.bookcarRecyclerview.adapter = CarListAdapter(object : CarListAdapter.clickListener {
            override fun onClicked(position: Int) {
                (requireActivity() as MainActivity).gotoPage(R.id.carDetailsFragmentFragment)
            }

        })
    }


    class CarListAdapter(val listener : clickListener) : RecyclerView.Adapter<CarListAdapter.FuelDataHolder>() {
        class FuelDataHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
            val binding = CarListItemsBinding.bind(itemView)
        }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FuelDataHolder {
            return  FuelDataHolder(LayoutInflater.from(parent.context).inflate(R.layout.car_list_items,parent,false))
        }

        override fun getItemCount(): Int {
            return  10
        }

        override fun onBindViewHolder(holder: FuelDataHolder, position: Int) {
                holder.itemView.setOnClickListener {
                    listener.onClicked(position)
                }
        }


        interface  clickListener{
            fun onClicked(position: Int)
        }
    }


}