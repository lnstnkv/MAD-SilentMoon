package com.example.silentmoon.home

import android.content.Intent
import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.FragmentActivity
import com.example.silentmoon.R
import com.example.silentmoon.coursedetails.CourseDetailsActivity
import com.example.silentmoon.databinding.FragmentHomeBinding
import com.example.silentmoon.databinding.FragmentMeditateBinding

class MeditateFragment : Fragment(R.layout.fragment_meditate) {

    companion object{
        val TAG = MeditateFragment::class.java.simpleName
        fun newInstance()= MeditateFragment()
    }
    private lateinit var binding: FragmentMeditateBinding
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentMeditateBinding.bind(view)
        val intent= Intent(activity,CourseDetailsActivity::class.java)
        binding.imageViewDailyCalm.setOnClickListener { startActivity(intent) }
    }

}