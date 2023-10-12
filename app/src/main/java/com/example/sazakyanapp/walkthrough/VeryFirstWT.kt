package com.example.sazakyanapp.walkthrough

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.example.sazakyanapp.HomeActivity
import com.example.sazakyanapp.R

class VeryFirstWT : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        setContentView(R.layout.activity_very_first_wt)


        findViewById<Button>(R.id.btnGetStarted).setOnClickListener {

            startActivity(Intent(this, HomeActivity::class.java))
            this@VeryFirstWT.overridePendingTransition(
                R.anim.animate_fade_enter,
                R.anim.animate_fade_exit
            )
        }

        fun onBackPressed() {
            super.onBackPressed()

            this@VeryFirstWT.overridePendingTransition(
                R.anim.animate_fade_enter,
                R.anim.animate_fade_exit
            )

        }
    }
}