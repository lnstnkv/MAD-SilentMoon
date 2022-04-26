package com.example.silentmoon.home

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.commit
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.example.silentmoon.R
import com.example.silentmoon.databinding.ActivityHomeBinding
import com.example.silentmoon.sleepmusic.SleepMusicActivity
import com.example.silentmoon.welcomesleep.WelcomeSleepActivity
import com.google.android.material.bottomnavigation.BottomNavigationView

class HomeActivity: AppCompatActivity(R.layout.activity_home) {

    private lateinit var viewBinding: ActivityHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)
        if(savedInstanceState==null){
            selectScreen(HomeFragment.TAG,HomeFragment.newInstance())
        }
        viewBinding.bottomNavigation.setOnItemSelectedListener {
            revealFragment(it.itemId)
        }
    }
    private fun revealFragment(itemId :Int):Boolean{

            when(itemId){
                R.id.navigation_home -> {
                    selectScreen(HomeFragment.TAG,HomeFragment.newInstance())
                    return true
                }
                R.id.navigation_meditate -> {
                    selectScreen(MeditateFragment.TAG,MeditateFragment.newInstance())
                     return true
                }
                R.id.navigation_sleep -> {
                    val intent= Intent(this, WelcomeSleepActivity::class.java)
                    selectScreen(SleepFragment.TAG,SleepFragment.newInstance())
                    startActivity(intent)
                    return true
                }
                else -> return false
            }

    }



    private fun selectScreen(tag:String, fragment: Fragment){
        supportFragmentManager.commit {
            val active= findActiveFragment()
            val target = supportFragmentManager.findFragmentByTag(tag)

            if(active != null && target != null && active== target) return@commit

            if (active!= null){
                hide(active)
            }
            if (target == null){
                add (R.id.fragmentContainerView, fragment, tag)
            } else {
                show(target)
            }
        }
    }
    private  fun findActiveFragment()= supportFragmentManager.fragments.find { it.isVisible }
}