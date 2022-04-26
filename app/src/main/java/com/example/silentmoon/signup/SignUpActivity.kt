package com.example.silentmoon.signup

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.example.silentmoon.R
import com.example.silentmoon.databinding.ActivityRemindersBinding
import com.example.silentmoon.databinding.ActivitySignUpBinding
import com.example.silentmoon.welcome.WelcomeActivity

class SignUpActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySignUpBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignUpBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.textViewPrivacyPolice.setOnClickListener {
            val text = "Тут будет политика конфиденциальности"
            val toast = Toast.makeText(applicationContext, text, Toast.LENGTH_SHORT)
            toast.setGravity(Gravity.CENTER, 0, 0)
            toast.show()
        }
        val intent = Intent(this@SignUpActivity, WelcomeActivity::class.java)
        binding.buttonGetStart.setOnClickListener { startActivity(intent) }

    }
}