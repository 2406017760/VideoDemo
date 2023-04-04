package com.flyme.video3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fromSohu = getIntent().getBooleanExtra("from_sohu",false)

        if (fromSohu) {
            findViewById<TextView>(R.id.tv).text = "本地视频"
        } else {
            val intent = Intent()
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)      // 原方案
            intent.setClassName("com.example.pluginapp","com.example.pluginapp.MainActivity")
            startActivity(intent)
            overridePendingTransition(0, 0)

            finishAndRemoveTask()                               // 原方案
//        finish()                                              // 现方案
        }

    }
}