package com.example.silentmoon.onboarding

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.silentmoon.R
import com.example.silentmoon.databinding.ActivityChooseTopicBinding
import com.example.silentmoon.databinding.ActivityMainBinding
import com.example.silentmoon.signin.SignInActivity
import com.example.silentmoon.signup.SignUpActivity

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val intent = Intent(this@MainActivity,SignUpActivity::class.java)
        binding.buttonsignUp.setOnClickListener { startActivity(intent) }
        binding.textViewLogIn.setOnClickListener{ startActivity(intent)}

    }
}