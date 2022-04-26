package com.example.silentmoon.coursedetails

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.silentmoon.R
import com.example.silentmoon.databinding.FragmentHomeBinding
import com.example.silentmoon.databinding.FragmentNarratotsBinding
import com.example.silentmoon.music.MusicActivity

class NarratorsFragment : Fragment(R.layout.fragment_narratots) {
    private lateinit var binding: FragmentNarratotsBinding
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding=FragmentNarratotsBinding.bind(view)
        val intent = Intent(activity, MusicActivity::class.java)
        binding.imageViewPlayMusic.setOnClickListener { startActivity(intent) }
        binding.imageViewPlayMusic2.setOnClickListener { startActivity(intent) }
        binding.imageViewPlayMusic3.setOnClickListener { startActivity(intent) }
    }
}