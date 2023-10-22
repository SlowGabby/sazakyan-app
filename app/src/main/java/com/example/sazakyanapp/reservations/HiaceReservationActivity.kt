package com.example.sazakyanapp.reservations

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.Button
import android.widget.CalendarView
import android.widget.EditText
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.example.sazakyanapp.HomeActivity
import com.example.sazakyanapp.R
import com.example.sazakyanapp.ReceiptActivity
import com.example.sazakyanapp.descriptions.HiaceDescription
import com.example.sazakyanapp.descriptions.RaptorDescription
import com.example.sazakyanapp.descriptions.ViosDescription
import com.example.sazakyanapp.profile.LoginActivity


class HiaceReservationActivity : AppCompatActivity() {

    private lateinit var pickUpDate : CalendarView
    private lateinit var dropOffDate : EditText
    private lateinit var pickUpLocation : EditText
    private lateinit var dropOffLocation : EditText
    private lateinit var submitButton: Button
    private lateinit var database : DatabaseReservation

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hiace_reservation)

        val artDialogBuilder = AlertDialog.Builder(this)

        pickUpDate = findViewById(R.id.editTextPickUpDate)
        dropOffDate = findViewById(R.id.editTextDropOffDate)
        pickUpLocation = findViewById(R.id.editTextPickUpLocation)
        dropOffLocation = findViewById(R.id.editTextDropOffLocation)
        submitButton = findViewById(R.id.button4)
        database = DatabaseReservation(this)


        findViewById<ImageView>(R.id.reservationBackBtn).setOnClickListener {

            startActivity(Intent(this@HiaceReservationActivity, HiaceDescription::class.java))

            this@HiaceReservationActivity.overridePendingTransition(
                R.anim.animate_fade_enter,
                R.anim.animate_fade_exit
            )
        }

        submitButton.setOnClickListener {

            val pickDate = pickUpDate.date.toString()
            val dropDate = dropOffDate.text.toString()
            val pickLocation = pickUpLocation.text.toString()
            val dropLocation = dropOffLocation.text.toString()


            if (TextUtils.isEmpty(pickDate) || TextUtils.isEmpty(
                    dropDate
                ) || TextUtils.isEmpty(pickLocation) || TextUtils.isEmpty(dropLocation)
            ) {
                Toast.makeText(this, "Enter all the required credentials", Toast.LENGTH_SHORT)
                    .show()
            } else {

                val saveData = database.insertReservationData(
                    pickDate,
                    dropDate,
                    pickLocation,
                    dropLocation
                )

                if (saveData == true) {

                    val intent = Intent(this@HiaceReservationActivity, ReceiptActivity::class.java)

                    intent.putExtra("date", pickUpDate.date.toString())
                    intent.putExtra("drop", dropOffDate.text.toString())
                    intent.putExtra("pickup", pickUpLocation.text.toString())
                    intent.putExtra("dropOff", dropOffLocation.text.toString())

                    artDialogBuilder.setTitle("Reservation Confirm")
                    artDialogBuilder.setMessage("Are you sure you want to reserve this car?")
                    artDialogBuilder.setCancelable(false)
                    artDialogBuilder.setPositiveButton("Yes") { _, _ ->

                        startActivity(intent)

                    }

                    artDialogBuilder.setNegativeButton("No") { _, _ ->

                    }

                    this@HiaceReservationActivity.overridePendingTransition(
                        R.anim.animate_fade_enter,
                        R.anim.animate_fade_exit
                    )

                    val alertDialogBox = artDialogBuilder.create()
                    alertDialogBox.show()

                    Toast.makeText(this, "Reservation Successful", Toast.LENGTH_SHORT).show()

                } else {

                    Toast.makeText(this, "Car Model already booked", Toast.LENGTH_SHORT).show()
                }
            }
        }
    }
}