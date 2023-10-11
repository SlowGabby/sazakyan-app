package com.example.sazakyanapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        Thread.sleep(1500)
        installSplashScreen()

        setContentView(R.layout.activity_main)


        findViewById<Button>(R.id.btnGetStarted).setOnClickListener {

            startActivity(Intent(this, HomeActivity::class.java))
            this@MainActivity.overridePendingTransition(
                R.anim.animate_fade_enter,
                R.anim.animate_fade_exit
            )
        }

        fun onBackPressed() {
            super.onBackPressed()

            this@MainActivity.overridePendingTransition(
                R.anim.animate_fade_enter,
                R.anim.animate_fade_exit
            )

        }
    }

}