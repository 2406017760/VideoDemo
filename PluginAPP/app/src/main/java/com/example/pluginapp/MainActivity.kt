package com.example.pluginapp

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager.widget.ViewPager
import com.example.pluginapp.databinding.ActivityMainBinding
import com.example.pluginapp.ui.main.SectionsPagerAdapter
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun goVideo(view: View) {
        val intent = Intent()
        intent.setClassName("com.flyme.video3","com.flyme.video3.MainActivity")
        intent.putExtra("from_sohu",true)
        startActivity(intent)
        overridePendingTransition(0, 0)
    }

    fun goSetting(view: View) {
        val intent = Intent()
        intent.setClass(this,SettingsActivity::class.java)
        startActivity(intent)
    }
}