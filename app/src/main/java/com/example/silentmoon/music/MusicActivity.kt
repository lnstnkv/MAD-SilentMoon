package com.example.silentmoon.music

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.silentmoon.R
import com.example.silentmoon.databinding.ActivityMusicBinding
import com.example.silentmoon.databinding.ActivityMusicSleepBinding

class MusicActivity : AppCompatActivity() {
    private lateinit var  binding: ActivityMusicBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMusicBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.toolbarControls.setOnClickListener { this.finish() }
    }
}