package com.example.sazakyanapp.walkthrough

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.sazakyanapp.HomeActivity
import com.example.sazakyanapp.R

class FirstWT : AppCompatActivity() {

    private lateinit var nextBtn : Button
    private lateinit var skipBtn : TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first_wt)


        nextBtn = findViewById(R.id.btnNext)
        skipBtn = findViewById(R.id.skipButton)

        nextBtn.setOnClickListener {

            startActivity(Intent(this@FirstWT, SecondWT::class.java))

        }

        skipBtn.setOnClickListener {

            startActivity(Intent(this@FirstWT, HomeActivity::class.java))

        }

        findViewById<Button>(R.id.btnNext).setOnClickListener {

            startActivity(Intent(this, SecondWT::class.java))
            this@FirstWT.overridePendingTransition(
                R.anim.animate_slide_left_enter,
                R.anim.animate_slide_left_exit
            )
        }
    }
}