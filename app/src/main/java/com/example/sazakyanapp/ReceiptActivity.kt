package com.example.sazakyanapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast

class ReceiptActivity : AppCompatActivity() {

    private lateinit var carModel : TextView
    private lateinit var datePick : TextView
    private lateinit var dateDrop : TextView
    private lateinit var locPick : TextView
    private lateinit var locDrop : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_receipt)

        carModel = findViewById(R.id.carName)
        datePick = findViewById(R.id.datePicked)
        dateDrop = findViewById(R.id.dateDrop)
        locPick = findViewById(R.id.locPick)
        locDrop = findViewById(R.id.locDrop)

        val userCar = intent.getStringExtra("car model").toString()
        val userDate = intent.getStringExtra("date").toString()
        val userDrop = intent.getStringExtra("drop").toString()
        val userPickUp = intent.getStringExtra("pickup").toString()
        val userDropOff = intent.getStringExtra("dropOff").toString()

        val a = "Car Model: $userCar"
        val b = "Date Picked: $userDate"
        val c = "Date Drop: $userDrop"
        val d = "Loc Pick: $userPickUp"
        val e = "Loc Drop: $userDropOff"

        carModel.text = a
        datePick.text = b
        dateDrop.text = c
        locPick.text = d
        locDrop.text = e

    }
}