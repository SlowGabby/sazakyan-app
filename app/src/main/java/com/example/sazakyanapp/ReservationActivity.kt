package com.example.sazakyanapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import com.example.sazakyanapp.descriptions.ViosDescription

class ReservationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reservation)


        findViewById<ImageView>(R.id.reservationBackBtn).setOnClickListener {

            startActivity(Intent(this@ReservationActivity, ViosDescription::class.java))
            this@ReservationActivity.overridePendingTransition(
                R.anim.animate_fade_enter,
                R.anim.animate_fade_exit
            )

        }
    }
}