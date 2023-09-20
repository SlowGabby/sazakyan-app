//This file is for the functionality of card-view or to jump in their specific car details

package com.example.sazakyanapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.renderscript.ScriptGroup.Binding
import android.view.Gravity
import android.view.View
import android.widget.ImageView
import android.widget.Toast
import com.example.sazakyanapp.databinding.ActivityCarsBinding

class CarsActivity : AppCompatActivity() {

    private lateinit var Binding : ActivityCarsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        Binding = ActivityCarsBinding.inflate(layoutInflater)

//        TOYOTA FUNCTIONALITY SECTION

        Binding.toyotaOnly.setOnClickListener() {

            val carBrands = Intent(this, CarToyotaActivity::class.java)
            startActivity(carBrands)
        }


        Binding.vios.setOnClickListener() {

            val carDescription = Intent(this, DescriptionActivity::class.java)
            startActivity(carDescription)

        }

        Binding.hiace.setOnClickListener() {

            val carDescription = Intent(this, DescriptionActivity::class.java)
            startActivity(carDescription)

        }

        Binding.toyota2.setOnClickListener() {

            val carDescription = Intent(this, DescriptionActivity::class.java)
            startActivity(carDescription)

        }

        Binding.toyota3.setOnClickListener() {

            val carDescription = Intent(this, DescriptionActivity::class.java)
            startActivity(carDescription)

        }

//        HONDA FUNCTIONALITY SECTION

        Binding.hondaOnly.setOnClickListener() {

            val carBrands = Intent(this, CarHondaActivity::class.java)
            startActivity(carBrands)

        }

        Binding.honda1.setOnClickListener() {

            val carDescription = Intent(this, DescriptionActivity::class.java)
            startActivity(carDescription)

        }

        Binding.honda2.setOnClickListener() {

            val carDescription = Intent(this, DescriptionActivity::class.java)
            startActivity(carDescription)

        }

        Binding.honda3.setOnClickListener() {

            val carDescription = Intent(this, DescriptionActivity::class.java)
            startActivity(carDescription)

        }

        Binding.honda4.setOnClickListener() {

            val carDescription = Intent(this, DescriptionActivity::class.java)
            startActivity(carDescription)

        }

        setContentView(Binding.root)
    }
}
//        Toast.makeText(applicationContext, "this image is clicked", Toast.LENGTH_SHORT).show()
//
//        val toast = Toast.makeText(applicationContext, "clicked", Toast.LENGTH_LONG)
//        toast.show()
//
//        val myToast = Toast.makeText(applicationContext, "clicked hehe", Toast.LENGTH_SHORT)
//        myToast.setGravity(Gravity.LEFT,200,200)
//        myToast.show()
