package com.example.cabbooking.onBoarding

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.cabbooking.Authentication.AuthActivity
import com.example.cabbooking.R
import com.example.cabbooking.databinding.ActivityOnBoardingActivithyBinding
import com.example.cabbooking.databinding.OnboardingItemsBinding

class OnBoardingActivithy : AppCompatActivity() {

     var _binding : ActivityOnBoardingActivithyBinding? = null
    val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityOnBoardingActivithyBinding.inflate(layoutInflater)
        setContentView(binding.root)


        var imageList = arrayListOf<Int>(R.drawable.onboarding1,R.drawable.onboarding2,R.drawable.onboarding3)

        binding.viewpager2.adapter = ViewPagerAdapter(imageList)
        binding.dotsIndicator.attachTo(binding.viewpager2)


        binding.getstarted.setOnClickListener {
            startActivity(Intent(this@OnBoardingActivithy,AuthActivity::class.java))
        }


    }


    class ViewPagerAdapter(val imageList: ArrayList<Int>) : RecyclerView.Adapter<ViewPagerAdapter.ViewPagerDataHolder>() {
        class ViewPagerDataHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
            val binding = OnboardingItemsBinding.bind(itemView.rootView)
        }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewPagerDataHolder {
            return ViewPagerDataHolder(LayoutInflater.from(parent.context).inflate(R.layout.onboarding_items,parent,false))
        }

        override fun getItemCount(): Int {
            return imageList.size
        }

        override fun onBindViewHolder(holder: ViewPagerDataHolder, position: Int) {

            holder.binding.images.setImageResource(imageList[position])

        }
    }
}