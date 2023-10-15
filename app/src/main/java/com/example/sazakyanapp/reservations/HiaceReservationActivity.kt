package com.example.sazakyanapp.reservations

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import com.example.sazakyanapp.HomeActivity
import com.example.sazakyanapp.R
import com.example.sazakyanapp.descriptions.HiaceDescription
import com.example.sazakyanapp.descriptions.RaptorDescription

class HiaceReservationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hiace_reservation)

        findViewById<ImageView>(R.id.reservationBackBtn).setOnClickListener {

            startActivity(Intent(this@HiaceReservationActivity, HiaceDescription::class.java))
            this@HiaceReservationActivity.overridePendingTransition(
                R.anim.animate_fade_enter,
                R.anim.animate_fade_exit
            )
        }
    }
}