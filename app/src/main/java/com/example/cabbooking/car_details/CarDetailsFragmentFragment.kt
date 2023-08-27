package com.example.cabbooking.car_details

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.cabbooking.MainActivity
import com.example.cabbooking.R
import com.example.cabbooking.databinding.FragmentCarDetailsFragmentBinding
import com.example.cabbooking.databinding.ReviewsItemsBinding


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

        binding.reviewRecyclerview.adapter = ReviewAdapter();


        binding.booknow.setOnClickListener {
            (requireActivity() as MainActivity).gotoPage(R.id.carBookingFragment)
        }
    }


    class  ReviewAdapter : RecyclerView.Adapter<ReviewAdapter.ReviewDataHolder>() {
        class ReviewDataHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
                val binding = ReviewsItemsBinding.bind(itemView.rootView)
        }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ReviewDataHolder {
            return ReviewDataHolder(LayoutInflater.from(parent.context).inflate(R.layout.reviews_items,parent,false))
        }

        override fun getItemCount(): Int {
            return 10
        }

        override fun onBindViewHolder(holder: ReviewDataHolder, position: Int) {

        }
    }


}