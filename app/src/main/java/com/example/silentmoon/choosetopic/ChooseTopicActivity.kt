package com.example.silentmoon.choosetopic

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ListView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.silentmoon.R
import com.example.silentmoon.databinding.ActivityChooseTopicBinding
import com.example.silentmoon.databinding.ActivityCourseDetailsBinding
import com.example.silentmoon.databinding.ActivitySignInBinding
import com.example.silentmoon.reminders.RemindersActivity
import com.example.silentmoon.signin.SignInActivity
import com.example.silentmoon.signup.SignUpActivity
import com.example.silentmoon.welcome.WelcomeActivity

class ChooseTopicActivity: AppCompatActivity(R.layout.activity_choose_topic) {
    private lateinit var binding: ActivityChooseTopicBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityChooseTopicBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val intent=Intent(this@ChooseTopicActivity,RemindersActivity::class.java)
        binding.imageViewReduceAnxietly.setOnClickListener { startActivity(intent) }
        binding.imageViewBetterSleep.setOnClickListener { startActivity(intent) }
        binding.imageViewImprovePerfomance.setOnClickListener { startActivity(intent) }
        binding.imageViewIncreaseHappiness.setOnClickListener { startActivity(intent) }
        binding.imageViewPersonalGrowth.setOnClickListener { startActivity(intent) }
        binding.imageViewReduceStress.setOnClickListener { startActivity(intent) }
        binding.imageViewReduseStressTwo.setOnClickListener { startActivity(intent) }
        binding.imageViewWork.setOnClickListener { startActivity(intent) }
    }
}



