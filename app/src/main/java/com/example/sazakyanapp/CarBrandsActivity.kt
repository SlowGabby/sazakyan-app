package com.example.sazakyanapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.sazakyanapp.databinding.ActivityCarBrandsBinding

class CarBrandsActivity : AppCompatActivity() {

    private lateinit var Binding : ActivityCarBrandsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        Binding = ActivityCarBrandsBinding.inflate(layoutInflater)

        Binding.toyotaOnly.setOnClickListener() {

            val carBrands = Intent(this, CarBrandsActivity::class.java)
            startActivity(carBrands)
        }

        setContentView(R.layout.activity_car_brands)
    }
}