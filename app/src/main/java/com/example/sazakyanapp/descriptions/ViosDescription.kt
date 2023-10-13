package com.example.sazakyanapp.descriptions

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import com.example.sazakyanapp.HomeActivity
import com.example.sazakyanapp.R
import com.example.sazakyanapp.ReservationActivity

class ViosDescription : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.description_vios)


        findViewById<ImageView>(R.id.viosDescriptionBackBtn).setOnClickListener {

            startActivity(Intent(this@ViosDescription, HomeActivity::class.java))
            this@ViosDescription.overridePendingTransition(
                R.anim.animate_fade_enter,
                R.anim.animate_fade_exit
            )

        }

        findViewById<Button>(R.id.reservationBtn).setOnClickListener {

            startActivity(Intent(this@ViosDescription, ReservationActivity::class.java))
            this@ViosDescription.overridePendingTransition(
                R.anim.animate_fade_enter,
                R.anim.animate_fade_exit
            )

        }

    }
}