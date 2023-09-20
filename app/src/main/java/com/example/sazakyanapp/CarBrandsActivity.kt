package com.example.sazakyanapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.sazakyanapp.databinding.ActivityCarBrandsBinding
import com.example.sazakyanapp.databinding.ActivityCarHondaBinding

class CarToyotaActivity : AppCompatActivity() {

    private lateinit var Binding : ActivityCarBrandsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        Binding = ActivityCarBrandsBinding.inflate(layoutInflater)

        Binding.toyotaOnly2.setOnClickListener() {

            val carBrands = Intent(this, CarToyotaActivity::class.java)
            startActivity(carBrands)
        }

        Binding.hondaOnly2.setOnClickListener() {

            val carHonda = Intent(this, CarHondaActivity::class.java)
            startActivity(carHonda)

        }

        setContentView(Binding.root)
    }
}