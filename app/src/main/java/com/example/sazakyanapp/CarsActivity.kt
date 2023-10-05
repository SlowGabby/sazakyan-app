package com.example.sazakyanapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView
import com.example.sazakyanapp.foton.FotonActivity
import com.example.sazakyanapp.honda.HondaActivity
import com.example.sazakyanapp.hyundai.HyundaiActivity
import com.example.sazakyanapp.toyota.ToyotaActivity

class CarsActivity : AppCompatActivity() {


    private lateinit var toyotaOnly : CardView
    private lateinit var hondaOnly : CardView
    private lateinit var fotonOnly : CardView
    private lateinit var hyundaiOnly: CardView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cars)


        toyotaOnly = findViewById(R.id.toyotaOnly)
        hondaOnly = findViewById(R.id.hondaOnly)
        fotonOnly = findViewById(R.id.fotonOnly)
        hyundaiOnly = findViewById(R.id.hyundaiOnly)

        toyotaOnly.setOnClickListener {

            startActivity(Intent(this@CarsActivity, ToyotaActivity::class.java))

        }
2
        hondaOnly.setOnClickListener {

            startActivity(Intent(this@CarsActivity, HondaActivity::class.java))

        }

        fotonOnly.setOnClickListener {

            startActivity(Intent(this@CarsActivity, FotonActivity::class.java))

        }

        hyundaiOnly.setOnClickListener {

            startActivity(Intent(this@CarsActivity, HyundaiActivity::class.java))

        }
    }
}