package com.example.cabbooking.Authentication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.annotation.IdRes
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import com.example.cabbooking.R
import com.example.cabbooking.databinding.ActivityAuthBinding
import com.example.cabbooking.utils.getNavOptions

class AuthActivity : AppCompatActivity() {
    lateinit var binding: ActivityAuthBinding
    lateinit var navController : NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAuthBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.fragmentContainerView) as NavHostFragment
         navController = navHostFragment.navController

    }

    fun gotoPage(@IdRes resId: Int, args: Bundle? = null){
        navController.navigate(resId,args,getNavOptions())
    }
}