package com.example.sazakyanapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.sazakyanapp.databinding.ActivityCarHondaBinding

class CarHondaActivity : AppCompatActivity() {

    private lateinit var Binding : ActivityCarHondaBinding
    override fun onCreate(savedInstanceState: Bundle?) {

        Binding = ActivityCarHondaBinding.inflate(layoutInflater)

        super.onCreate(savedInstanceState)

        Binding.hondaOnly2.setOnClickListener() {

            val carBrands = Intent(this, CarHondaActivity::class.java)
            startActivity(carBrands)

        }

        Binding.toyotaOnly2.setOnClickListener() {

            val carBrands = Intent(this, CarToyotaActivity::class.java)
            startActivity(carBrands)

        }

        setContentView(Binding.root)
    }
}