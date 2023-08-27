package com.example.cabbooking.utils

import android.app.Dialog
import android.content.Context
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.Window
import androidx.fragment.app.FragmentActivity
import androidx.navigation.NavOptions
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.example.cabbooking.R
import com.example.cabbooking.databinding.DriverDialogBinding

fun Context.getNavOptions() : NavOptions = NavOptions.Builder()
    .setEnterAnim(R.anim.cust_slide_in)
    .setExitAnim(R.anim.cust_fade_out)
    .setPopEnterAnim(R.anim.cust_fade_in)
    .setPopExitAnim(R.anim.cust_slide_out)
    .build()


fun Context.DriverDialog(listner : ClickListener): Dialog {
    val dialog = Dialog(this)
    val binding = DriverDialogBinding.inflate(LayoutInflater.from(this))
    dialog.requestWindowFeature(Window.FEATURE_NO_TITLE)
    dialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT));
    dialog.setCancelable(false)
    dialog.setContentView(binding.root)

    binding.recyclerView.adapter = DriveAdapter()

    dialog.show()


    binding.hirenow.setOnClickListener {
        dialog.dismiss()
        listner.onClicked()
    }

    return dialog
}

interface ClickListener{
    fun onClicked()
}

class DriveAdapter : RecyclerView.Adapter<DriveAdapter.DriveDataHolder>() {
    class DriveDataHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DriveDataHolder {
        return DriveDataHolder(LayoutInflater.from(parent.context).inflate(R.layout.derive_for_items,parent,false))
    }

    override fun getItemCount(): Int {
        return 4
    }

    override fun onBindViewHolder(holder: DriveDataHolder, position: Int) {

    }
}
