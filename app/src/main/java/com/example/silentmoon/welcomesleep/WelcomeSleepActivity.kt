package com.example.silentmoon.welcomesleep

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.silentmoon.R
import com.example.silentmoon.databinding.ActivityCourseDetailsBinding
import com.example.silentmoon.databinding.ActivityWelcomeSleepBinding
import com.example.silentmoon.databinding.FragmentSleepBinding
import com.example.silentmoon.home.HomeActivity
import com.example.silentmoon.home.SleepFragment
import com.example.silentmoon.playoption.PlayOptionActivity
import com.example.silentmoon.sleepmusic.SleepMusicActivity

class WelcomeSleepActivity : AppCompatActivity() {
    private lateinit var  binding: ActivityWelcomeSleepBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityWelcomeSleepBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val intent= Intent(this@WelcomeSleepActivity,SleepFragment::class.java)
        binding.buttonGetStartedSleep.setOnClickListener {
            this.finish();
        }
    }
}