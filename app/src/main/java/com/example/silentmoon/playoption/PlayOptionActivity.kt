package com.example.silentmoon.playoption

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.silentmoon.databinding.ActivityPlayOptionBinding
import com.example.silentmoon.musicsleep.MusicSleepActivity

class PlayOptionActivity : AppCompatActivity() {
    private lateinit var binding: ActivityPlayOptionBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPlayOptionBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val intent = Intent(this@PlayOptionActivity, MusicSleepActivity::class.java)
        binding.buttonPlayOption.setOnClickListener { startActivity(intent) }
        binding.toolbarControls.setOnClickListener { this.finish() }
    }
}