package com.example.silentmoon.reminders

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.silentmoon.R
import com.example.silentmoon.databinding.ActivityChooseTopicBinding
import com.example.silentmoon.databinding.ActivityRemindersBinding
import com.example.silentmoon.home.HomeActivity
import com.example.silentmoon.home.HomeFragment
import com.example.silentmoon.welcome.WelcomeActivity

class RemindersActivity: AppCompatActivity() {
    private lateinit var binding: ActivityRemindersBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRemindersBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val intent=Intent(this@RemindersActivity,HomeActivity::class.java)
        binding.buttonNoThanks.setOnClickListener {startActivity(intent)}
        binding.buttonSave.setOnClickListener {startActivity(intent) }
    }
}