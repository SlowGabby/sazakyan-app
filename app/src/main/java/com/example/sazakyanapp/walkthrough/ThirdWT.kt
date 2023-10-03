package com.example.sazakyanapp.walkthrough

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.sazakyanapp.HomeActivity
import com.example.sazakyanapp.MainHomeActivity
import com.example.sazakyanapp.R
import com.example.sazakyanapp.profile.LoginActivity
import com.example.sazakyanapp.profile.SignUpActivity

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
    }
}