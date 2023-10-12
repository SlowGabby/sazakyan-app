package com.example.sazakyanapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.example.sazakyanapp.profile.MainProfileActivity
import com.example.sazakyanapp.walkthrough.SecondWT


class MainActivity : AppCompatActivity() {

    private lateinit var nextBtn : Button
    private lateinit var skipBtn : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        Thread.sleep(1500)
        installSplashScreen()

        setContentView(R.layout.activity_main)

        nextBtn = findViewById(R.id.btnNext)
        skipBtn = findViewById(R.id.skipButton)

        nextBtn.setOnClickListener {

            startActivity(Intent(this@MainActivity, SecondWT::class.java))

        }

        skipBtn.setOnClickListener {

            startActivity(Intent(this@MainActivity, MainProfileActivity::class.java))

        }

    }


}