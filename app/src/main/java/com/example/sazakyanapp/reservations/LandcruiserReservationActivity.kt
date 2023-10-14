package com.example.sazakyanapp.reservations

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.example.sazakyanapp.R
import com.example.sazakyanapp.descriptions.LandcruiserDescription

class LandcruiserReservationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_landcruiser_reservation)

        findViewById<ImageView>(R.id.reservationBackBtn).setOnClickListener {

            startActivity(Intent(this@LandcruiserReservationActivity, LandcruiserDescription::class.java))
            this@LandcruiserReservationActivity.overridePendingTransition(
                R.anim.animate_fade_enter,
                R.anim.animate_fade_exit
            )
        }
    }
}