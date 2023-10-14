package com.example.sazakyanapp.profile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.sazakyanapp.R

class MainProfileActivity : AppCompatActivity() {

    private lateinit var signupButton : Button
    private lateinit var loginButton : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_profile)

        signupButton = findViewById(R.id.button2)
        loginButton = findViewById(R.id.button)

        signupButton.setOnClickListener {

            val intent = Intent(this@MainProfileActivity, SignupActivity::class.java)
            startActivity(intent)
            this@MainProfileActivity.overridePendingTransition(
                R.anim.animate_fade_enter,
                R.anim.animate_fade_exit
            )

        }

        loginButton.setOnClickListener {

            val intent = Intent(this@MainProfileActivity, LoginActivity::class.java)
            startActivity(intent)
            this@MainProfileActivity.overridePendingTransition(
                R.anim.animate_fade_enter,
                R.anim.animate_fade_exit
            )

        }
    }
}