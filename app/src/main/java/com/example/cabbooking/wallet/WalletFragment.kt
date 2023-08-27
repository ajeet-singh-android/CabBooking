package com.example.cabbooking.wallet

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.cabbooking.R
import com.example.cabbooking.databinding.FragmentHomeBinding
import com.example.cabbooking.databinding.FragmentWalletBinding


class WalletFragment : Fragment() {


    var _binding : FragmentWalletBinding? = null
    val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_wallet, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        _binding = FragmentWalletBinding.bind(view)

        binding.recommendedRecyclerview.adapter = RecommendedAdapter()
    }


    class RecommendedAdapter : RecyclerView.Adapter<RecommendedAdapter.RecommendedDataHolder>() {
        class RecommendedDataHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecommendedDataHolder {
            return RecommendedDataHolder(LayoutInflater.from(parent.context).inflate(R.layout.recommended_money_items,parent,false))
        }

        override fun getItemCount(): Int {
            return 6
        }

        override fun onBindViewHolder(holder: RecommendedDataHolder, position: Int) {

        }
    }

}