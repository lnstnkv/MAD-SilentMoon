package com.example.silentmoon.sleepmusic

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.silentmoon.R
import com.example.silentmoon.databinding.ActivityCourseDetailsBinding
import com.example.silentmoon.databinding.ActivitySleepMusicBinding
import com.example.silentmoon.playoption.PlayOptionActivity

class SleepMusicActivity : AppCompatActivity() {
    private lateinit var  binding: ActivitySleepMusicBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySleepMusicBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val intent= Intent(this@SleepMusicActivity, PlayOptionActivity::class.java)
        binding.imageGoodNight2.setOnClickListener { startActivity(intent)}
        binding.imageGoodNight3.setOnClickListener { startActivity(intent)}
        binding.imageGoodNight4.setOnClickListener { startActivity(intent)}
        binding.imageSweetSleep3.setOnClickListener { startActivity(intent)}
        binding.imageSweetSlepp2.setOnClickListener { startActivity(intent)}
        binding.imageSweetSlepp4.setOnClickListener { startActivity(intent)}
        binding.imageViewCloudsSleep.setOnClickListener { startActivity(intent)}
        binding.imageViewOwlSleep.setOnClickListener { startActivity(intent)}
        binding.toolbarControls.setOnClickListener { this.finish() }    }

}