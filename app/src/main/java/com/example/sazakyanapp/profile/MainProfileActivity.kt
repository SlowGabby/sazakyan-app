package com.example.sazakyanapp.profile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.sazakyanapp.R

class MainProfileActivity : AppCompatActivity() {

    private lateinit var btnsignup : Button
    private lateinit var btnlogin : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_profile)

        btnsignup = findViewById(R.id.button2)
        btnlogin = findViewById(R.id.button)

        btnsignup.setOnClickListener {

            val intent = Intent(this@MainProfileActivity, SignupActivity::class.java)
            startActivity(intent)

        }

        btnlogin.setOnClickListener {

            val intent = Intent(this@MainProfileActivity, LoginActivity::class.java)
            startActivity(intent)

        }
    }
}