package com.example.sazakyanapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.widget.ImageView
import android.widget.Toast

class CarsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cars)

    }

    fun carDetails(view: View) {

        val moreInfo = findViewById<ImageView>(R.id.carDetails)

        moreInfo.setOnClickListener() {
            val carDescription = Intent(this, DescriptionActivity::class.java)
            startActivity(carDescription)
        }
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
