package com.example.sazakyanapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.sazakyanapp.walkthrough.SecondWT

class HomeActivity : AppCompatActivity() {


    private lateinit var getStarted : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)


        getStarted = findViewById(R.id.btnGetStarted)

        getStarted.setOnClickListener {

            startActivity(Intent(this@HomeActivity, CarsActivity::class.java))

        }

        findViewById<Button>(R.id.btnGetStarted).setOnClickListener {

            startActivity(Intent(this, MainHomeActivity::class.java))
            this@HomeActivity.overridePendingTransition(
                R.anim.animate_fade_enter,
                R.anim.animate_fade_exit
            )
        }

        fun onBackPressed() {
            super.onBackPressed()

            this@HomeActivity.overridePendingTransition(
                R.anim.animate_fade_enter,
                R.anim.animate_fade_exit
            )

        }
    }
}