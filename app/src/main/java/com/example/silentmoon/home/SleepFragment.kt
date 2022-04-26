package com.example.silentmoon.home

import android.content.Intent
import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.silentmoon.R
import com.example.silentmoon.coursedetails.CourseDetailsActivity
import com.example.silentmoon.databinding.FragmentHomeBinding
import com.example.silentmoon.databinding.FragmentSleepBinding
import com.example.silentmoon.playoption.PlayOptionActivity
import com.example.silentmoon.sleepmusic.SleepMusicActivity
import com.example.silentmoon.welcomesleep.WelcomeSleepActivity

class SleepFragment : Fragment(R.layout.fragment_sleep) {
    companion object{
        val TAG = SleepFragment::class.java.simpleName
        fun newInstance()= SleepFragment()
    }
    private lateinit var binding: FragmentSleepBinding
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentSleepBinding.bind(view)

        val intent= Intent(activity, SleepMusicActivity::class.java)
        val intentPlayOption= Intent(activity, PlayOptionActivity::class.java)
        binding.buttonStartOceanMoon.setOnClickListener { startActivity(intent)}
        binding.imageViewOceanMoon.setOnClickListener { startActivity(intent)}
        binding.imageViewClouds.setOnClickListener { startActivity(intentPlayOption)}
        binding.imageViewMoon.setOnClickListener { startActivity(intentPlayOption)}
        binding.imageViewPinkClouds.setOnClickListener { startActivity(intentPlayOption)}
        binding.imageViewOwl.setOnClickListener { startActivity(intentPlayOption)}    }
}