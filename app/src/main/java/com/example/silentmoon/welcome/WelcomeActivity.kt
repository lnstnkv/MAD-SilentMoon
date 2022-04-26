package com.example.silentmoon.welcome

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.silentmoon.R
import com.example.silentmoon.choosetopic.ChooseTopicActivity
import com.example.silentmoon.databinding.ActivityRemindersBinding
import com.example.silentmoon.databinding.ActivityWelcomeBinding

class WelcomeActivity : AppCompatActivity() {
    private lateinit var binding: ActivityWelcomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityWelcomeBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val intent = Intent(this@WelcomeActivity, ChooseTopicActivity::class.java)
        binding.buttonGetStarted.setOnClickListener{
            startActivity(intent)
        }
    }
}