package com.example.cabbooking

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.annotation.IdRes
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import com.example.cabbooking.databinding.ActivityMainBinding
import com.example.cabbooking.utils.getNavOptions

class MainActivity : AppCompatActivity() {


    var _binding : ActivityMainBinding? = null
    lateinit var navController : NavController
    val binding get() = _binding!!
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityMainBinding.inflate(layoutInflater);
        setContentView(binding.root)



        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.fragmentContainerView) as NavHostFragment
        navController = navHostFragment.navController

    }

    fun gotoPage(@IdRes resId: Int, args: Bundle? = null){
        navController.navigate(resId,args,getNavOptions())
    }
}

