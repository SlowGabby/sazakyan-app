package com.example.sazakyanapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.cardview.widget.CardView
import com.denzcoskun.imageslider.ImageSlider
import com.denzcoskun.imageslider.constants.ScaleTypes
import com.denzcoskun.imageslider.models.SlideModel
import com.example.sazakyanapp.pangasinan.PangasinanActivity

class HomeActivity : AppCompatActivity() {

    private lateinit var imageSlider : ImageSlider

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_home)

//        IMAGE SLIDER

        imageSlider = findViewById(R.id.imageSlider)

        val imagesList = ArrayList<SlideModel>()
        imagesList.add(SlideModel(R.drawable.first_promo))
        imagesList.add(SlideModel(R.drawable.promo_bg))
        imagesList.add(SlideModel(R.drawable.me))

        imageSlider.setImageList(imagesList, ScaleTypes.CENTER_INSIDE)


//        BROWSE BY LOCATION FUNCTIONS/INTENTS


        findViewById<CardView>(R.id.dagupanOnly).setOnClickListener {

            startActivity(Intent(this@HomeActivity, PangasinanActivity::class.java))

        }

        findViewById<TextView>(R.id.helpCenter).setOnClickListener {

            startActivity(Intent(this@HomeActivity, HelpCenterActivity::class.java))

        }

    }
}