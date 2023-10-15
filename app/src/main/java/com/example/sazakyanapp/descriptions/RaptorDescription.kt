package com.example.sazakyanapp.descriptions

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import com.example.sazakyanapp.HomeActivity
import com.example.sazakyanapp.R
import com.example.sazakyanapp.reservations.RaptorReservationActivity
import com.example.sazakyanapp.reservations.ReservationActivity

class RaptorDescription : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.description_raptor)

        findViewById<ImageView>(R.id.hiluxDescriptionBackBtn).setOnClickListener {

            startActivity(Intent(this@RaptorDescription, HomeActivity::class.java))
            this@RaptorDescription.overridePendingTransition(
                R.anim.animate_fade_enter,
                R.anim.animate_fade_exit
            )

        }

        findViewById<Button>(R.id.reservationBtn).setOnClickListener {

            startActivity(Intent(this@RaptorDescription, RaptorReservationActivity::class.java))
            this@RaptorDescription.overridePendingTransition(
                R.anim.animate_fade_enter,
                R.anim.animate_fade_exit
            )
        }
    }
}