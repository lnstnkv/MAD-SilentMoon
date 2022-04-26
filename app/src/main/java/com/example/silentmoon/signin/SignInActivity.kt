package com.example.silentmoon.signin

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.silentmoon.R
import com.example.silentmoon.coursedetails.CourseDetailsActivity
import com.example.silentmoon.databinding.ActivityChooseTopicBinding
import com.example.silentmoon.databinding.ActivitySignInBinding
import com.example.silentmoon.databinding.FragmentHomeBinding
import com.example.silentmoon.reminders.RemindersActivity
import com.example.silentmoon.signup.SignUpActivity
import com.example.silentmoon.welcome.WelcomeActivity

class SignInActivity : AppCompatActivity(R.layout.activity_sign_in) {
    private lateinit var binding: ActivitySignInBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignInBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val intent = Intent(this@SignInActivity, WelcomeActivity::class.java)
        binding.buttonlogIn.setOnClickListener { startActivity(intent) }
    }
}