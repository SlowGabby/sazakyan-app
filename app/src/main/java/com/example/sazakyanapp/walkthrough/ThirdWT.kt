package com.example.sazakyanapp.walkthrough

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.sazakyanapp.HomeActivity
import com.example.sazakyanapp.R
import com.example.sazakyanapp.LoginActivity
import com.example.sazakyanapp.SignUpActivity

class ThirdWT : AppCompatActivity() {

    private lateinit var nextBtn : Button
    private lateinit var skipBtn : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third_wt)

        nextBtn = findViewById(R.id.btnNext3)
        skipBtn = findViewById(R.id.skipButton)

        nextBtn.setOnClickListener {

            startActivity(Intent(this@ThirdWT, LoginActivity::class.java))

        }

        skipBtn.setOnClickListener {

            startActivity(Intent(this@ThirdWT, SignUpActivity::class.java))

        }

        findViewById<Button>(R.id.btnNext3).setOnClickListener {

            startActivity(Intent(this, HomeActivity::class.java))
            this@ThirdWT.overridePendingTransition(
                R.anim.animate_slide_left_enter,
                R.anim.animate_slide_left_exit
            )
        }

        fun onBackPressed() {
            super.onBackPressed()

            startActivity(Intent(this, SecondWT::class.java))
            this@ThirdWT.overridePendingTransition(
                R.anim.animate_fade_enter,
                R.anim.animate_fade_exit
            )

        }
    }
}