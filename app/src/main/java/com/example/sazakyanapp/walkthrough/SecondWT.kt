package com.example.sazakyanapp.walkthrough

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.sazakyanapp.HomeActivity
import com.example.sazakyanapp.R

class SecondWT : AppCompatActivity() {


    private lateinit var nextBtn : Button
    private lateinit var skipBtn : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second_wt)


        nextBtn = findViewById(R.id.btnNext2)
        skipBtn = findViewById(R.id.skipButton)

        nextBtn.setOnClickListener {

            startActivity(Intent(this@SecondWT, ThirdWT::class.java))

        }

        skipBtn.setOnClickListener {

            startActivity(Intent(this@SecondWT, HomeActivity::class.java))

        }

        findViewById<Button>(R.id.btnNext2).setOnClickListener {

            startActivity(Intent(this, ThirdWT::class.java))
            this@SecondWT.overridePendingTransition(
                R.anim.animate_slide_left_enter,
                R.anim.animate_slide_left_exit
            )
        }

        fun onBackPressed() {
            super.onBackPressed()

            this@SecondWT.overridePendingTransition(
                R.anim.animate_fade_enter,
                R.anim.animate_fade_exit
            )

        }

    }
}