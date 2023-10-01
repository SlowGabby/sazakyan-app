package com.example.sazakyanapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class HomeActivity : AppCompatActivity() {


    private lateinit var getStarted : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)


        getStarted = findViewById(R.id.btnGetStarted)

        getStarted.setOnClickListener {

            startActivity(Intent(this@HomeActivity, CarsActivity::class.java))

        }
    }
}