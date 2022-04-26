package com.example.silentmoon.home

import android.content.Intent
import android.os.Binder
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.silentmoon.R
import com.example.silentmoon.coursedetails.CourseDetailsActivity
import com.example.silentmoon.databinding.FragmentHomeBinding


class HomeFragment : Fragment(R.layout.fragment_home) {
    companion object{
       val TAG = HomeFragment::class.java.simpleName
       fun newInstance()= HomeFragment()
   }
    private lateinit var binding: FragmentHomeBinding
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentHomeBinding.bind(view)
        val intent= Intent(activity,CourseDetailsActivity::class.java)
        binding.imageViewDailyThought.setOnClickListener { startActivity(intent) }
        binding.toggleButtonPlayMusic.setOnClickListener { startActivity(intent) }
        binding.imageViewBasics.setOnClickListener { startActivity(intent) }
        binding.imageViewRelaxtion.setOnClickListener { startActivity(intent) }
        binding.buttonStartBlack.setOnClickListener { startActivity(intent) }
        binding.buttonStartWhite.setOnClickListener { startActivity(intent) }
    }

}