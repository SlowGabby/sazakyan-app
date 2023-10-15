package com.example.sazakyanapp.descriptions

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import com.example.sazakyanapp.HomeActivity
import com.example.sazakyanapp.R
import com.example.sazakyanapp.reservations.LandcruiserReservationActivity
import com.example.sazakyanapp.reservations.ViosReservationActivity

class LandcruiserDescription : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.description_landcruiser)

        findViewById<ImageView>(R.id.landCruiserDescriptionBackBtn).setOnClickListener {

            startActivity(Intent(this@LandcruiserDescription, HomeActivity::class.java))
            this@LandcruiserDescription.overridePendingTransition(
                R.anim.animate_fade_enter,
                R.anim.animate_fade_exit
            )
        }

        findViewById<Button>(R.id.reservationBtn).setOnClickListener {

            startActivity(Intent(this@LandcruiserDescription, LandcruiserReservationActivity::class.java))
            this@LandcruiserDescription.overridePendingTransition(
                R.anim.animate_fade_enter,
                R.anim.animate_fade_exit
            )
        }

    }
}