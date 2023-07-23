package com.example.cabbooking.utils

import android.content.Context
import androidx.navigation.NavOptions
import com.example.cabbooking.R

fun Context.getNavOptions() : NavOptions = NavOptions.Builder()
    .setEnterAnim(R.anim.cust_slide_in)
    .setExitAnim(R.anim.cust_fade_out)
    .setPopEnterAnim(R.anim.cust_fade_in)
    .setPopExitAnim(R.anim.cust_slide_out)
    .build()