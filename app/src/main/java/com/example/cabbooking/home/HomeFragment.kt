package com.example.cabbooking.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.cabbooking.MainActivity
import com.example.cabbooking.R
import com.example.cabbooking.databinding.CategoryItemsBinding
import com.example.cabbooking.databinding.FragmentHomeBinding
import com.example.cabbooking.databinding.FuelStationItemsBinding
import com.example.cabbooking.databinding.HireDriverSliderItemBinding
import com.example.cabbooking.databinding.HomeCarItemsBinding
import com.example.cabbooking.databinding.HomeHireDriverItemsBinding
import com.example.cabbooking.databinding.OnboardingItemsBinding
import com.example.cabbooking.databinding.SliderCarItemsBinding
import com.example.cabbooking.onBoarding.OnBoardingActivithy


class HomeFragment : Fragment() {

    var _binding : FragmentHomeBinding? = null
    val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        _binding = FragmentHomeBinding.bind(view)


        binding.categoryRecyclerview.adapter = CategroyAdapter()
        binding.bookcarRecyclerview.adapter = BookCarAdapter()
        binding.fuelstationyRecyclerview.adapter = FuelAdapter()
        binding.carViewpager.adapter = CarViewPagerAdapter()
        binding.springDotsIndicator.attachTo(binding.carViewpager)


        //Hire Driver
        binding.hiredriverViewpager.adapter = HireDriverViewPagerAdapter()
        binding.hirediriverIndicator.attachTo(binding.hiredriverViewpager)
        binding.hiredriverRecyclerview.adapter = HireDriverAdapter()

        //Hire Driver
        binding.driverschoolViewpager.adapter = HireDriverViewPagerAdapter()
        binding.drivingschoolIndicator.attachTo(binding.driverschoolViewpager)
        binding.drivingschoolRecyclerview.adapter = HireDriverAdapter()


        binding.cartitleLayout.setOnClickListener {
            (requireActivity() as MainActivity).gotoPage(R.id.carListFragment)
        }


        binding.hiredierviewLayout.setOnClickListener {
            (requireActivity() as MainActivity).gotoPage(R.id.hireDriverListFragment)
        }
    }



    class FuelAdapter : RecyclerView.Adapter<FuelAdapter.FuelDataHolder>() {
        class FuelDataHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
            val binding = FuelStationItemsBinding.bind(itemView)
        }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FuelDataHolder {
            return  FuelDataHolder(LayoutInflater.from(parent.context).inflate(R.layout.fuel_station_items,parent,false))
        }

        override fun getItemCount(): Int {
            return  10
        }

        override fun onBindViewHolder(holder: FuelDataHolder, position: Int) {

        }
    }


    class CategroyAdapter : RecyclerView.Adapter<CategroyAdapter.CategoryDataHolder>() {
        class CategoryDataHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
            val binding = CategoryItemsBinding.bind(itemView)
        }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoryDataHolder {
            return  CategoryDataHolder(LayoutInflater.from(parent.context).inflate(R.layout.category_items,parent,false))
        }

        override fun getItemCount(): Int {
            return  10
        }

        override fun onBindViewHolder(holder: CategoryDataHolder, position: Int) {

        }
    }


    class BookCarAdapter : RecyclerView.Adapter<BookCarAdapter.BookCarDataHolder>() {
        class BookCarDataHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
            val binding = HomeCarItemsBinding.bind(itemView)
        }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BookCarDataHolder {
            return  BookCarDataHolder(LayoutInflater.from(parent.context).inflate(R.layout.home_car_items,parent,false))
        }

        override fun getItemCount(): Int {
            return  10
        }

        override fun onBindViewHolder(holder: BookCarDataHolder, position: Int) {

        }
    }



    class CarViewPagerAdapter : RecyclerView.Adapter<CarViewPagerAdapter.ViewPagerDataHolder>() {
        class ViewPagerDataHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
            val binding = SliderCarItemsBinding.bind(itemView.rootView)
        }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewPagerDataHolder {
            return ViewPagerDataHolder(LayoutInflater.from(parent.context).inflate(R.layout.slider_car_items,parent,false))
        }

        override fun getItemCount(): Int {
            return 4
        }

        override fun onBindViewHolder(holder: ViewPagerDataHolder, position: Int) {



        }
    }


    class HireDriverViewPagerAdapter : RecyclerView.Adapter<HireDriverViewPagerAdapter.HireDriverSliderDataHolder>() {
        class HireDriverSliderDataHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
            val binding = HireDriverSliderItemBinding.bind(itemView.rootView)
        }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HireDriverSliderDataHolder {
            return HireDriverSliderDataHolder(LayoutInflater.from(parent.context).inflate(R.layout.hire_driver_slider_item,parent,false))
        }

        override fun getItemCount(): Int {
            return 4
        }

        override fun onBindViewHolder(holder: HireDriverSliderDataHolder, position: Int) {



        }
    }


    class HireDriverAdapter : RecyclerView.Adapter<HireDriverAdapter.HireDriverDataHolder>() {
        class HireDriverDataHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
            val binding = HomeHireDriverItemsBinding.bind(itemView)
        }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HireDriverDataHolder {
            return  HireDriverDataHolder(LayoutInflater.from(parent.context).inflate(R.layout.home_hire_driver_items,parent,false))
        }

        override fun getItemCount(): Int {
            return  10
        }

        override fun onBindViewHolder(holder: HireDriverDataHolder, position: Int) {

        }
    }
}

