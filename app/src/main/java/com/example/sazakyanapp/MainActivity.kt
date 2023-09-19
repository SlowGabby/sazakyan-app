package com.example.sazakyanapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //get the component with id
        val btnLogin = findViewById<Button>(R.id.btnLogin)

        btnLogin.setOnClickListener() {
            val availableCars = Intent(this, CarsActivity::class.java)
            startActivity(availableCars)
        }
    }
}