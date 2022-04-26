package com.example.silentmoon.coursedetails

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import androidx.viewpager2.widget.ViewPager2
import com.example.silentmoon.R
import com.example.silentmoon.databinding.ActivityCourseDetailsBinding
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class CourseDetailsActivity : AppCompatActivity(R.layout.activity_course_details) {
    private lateinit var  binding: ActivityCourseDetailsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCourseDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val tablLayout : TabLayout = binding.tabLayout
        val viewPager : ViewPager2 = binding.viewPager
        viewPager.adapter = ViewPagerAdapter(this)
        TabLayoutMediator(tablLayout,viewPager){ tab, position ->
            tab.setText(tabTitles[position])
        }.attach()

    }
    private val tabTitles = arrayListOf("Male voice","Female voice")
}