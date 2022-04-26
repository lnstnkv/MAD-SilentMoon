package com.example.silentmoon.musicsleep

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.silentmoon.R
import com.example.silentmoon.databinding.ActivityCourseDetailsBinding
import com.example.silentmoon.databinding.ActivityMusicSleepBinding

class MusicSleepActivity : AppCompatActivity() {
    private lateinit var  binding: ActivityMusicSleepBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMusicSleepBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.toolbarControls.setOnClickListener { this.finish() }
    }
}