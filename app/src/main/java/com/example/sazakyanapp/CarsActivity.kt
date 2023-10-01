package com.example.sazakyanapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView
import com.example.sazakyanapp.honda.HondaActivity
import com.example.sazakyanapp.toyota.ToyotaActivity

class CarsActivity : AppCompatActivity() {


    private lateinit var toyotaOnly : CardView
    private lateinit var hondaOnly : CardView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cars)


        toyotaOnly = findViewById(R.id.toyotaOnly)
        hondaOnly = findViewById(R.id.hondaOnly)

        toyotaOnly.setOnClickListener {

            startActivity(Intent(this@CarsActivity, ToyotaActivity::class.java))

        }

        hondaOnly.setOnClickListener {

            startActivity(Intent(this@CarsActivity, HondaActivity::class.java))

        }
    }
}