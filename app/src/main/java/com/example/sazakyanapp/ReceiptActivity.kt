package com.example.sazakyanapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CalendarView
import android.widget.TextView
import android.widget.Toast
import com.google.android.material.textview.MaterialTextView

class ReceiptActivity : AppCompatActivity() {

    private lateinit var datePick : MaterialTextView
    private lateinit var dateDrop : TextView
    private lateinit var locPick : TextView
    private lateinit var locDrop : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_receipt)

        datePick = findViewById<MaterialTextView>(R.id.datePicked)
        dateDrop = findViewById(R.id.dateDrop)
        locPick = findViewById(R.id.locPick)
        locDrop = findViewById(R.id.locDrop)

        val userDate = intent.getStringExtra("date")?.toLong()
        val userDrop = intent.getStringExtra("drop").toString()
        val userPickUp = intent.getStringExtra("pickup").toString()
        val userDropOff = intent.getStringExtra("dropOff").toString()

        val b = "Date Picked: $userDate"
        val c = "Date Drop: $userDrop"
        val d = "Loc Pick: $userPickUp"
        val e = "Loc Drop: $userDropOff"

        datePick.text = b
        dateDrop.text = c
        locPick.text = d
        locDrop.text = e

    }
}