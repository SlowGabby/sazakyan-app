package com.example.sazakyanapp

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.denzcoskun.imageslider.ImageSlider
import com.denzcoskun.imageslider.constants.ScaleTypes
import com.denzcoskun.imageslider.models.SlideModel
import com.example.sazakyanapp.pangasinan.PangasinanActivity

class MainActivity : AppCompatActivity() {

    private lateinit var imageSlider : ImageSlider

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        Thread.sleep(1500)
        installSplashScreen()

        setContentView(R.layout.activity_main)

//        IMAGE SLIDER

        imageSlider = findViewById(R.id.imageSlider)

        val imagesList = ArrayList<SlideModel>()
        imagesList.add(SlideModel(R.drawable.first_promo))
        imagesList.add(SlideModel(R.drawable.promo_bg))
        imagesList.add(SlideModel(R.drawable.me))

        imageSlider.setImageList(imagesList, ScaleTypes.CENTER_INSIDE)


//        BROWSE BY LOCATION FUNCTIONS/INTENTS


        findViewById<CardView>(R.id.dagupanOnly).setOnClickListener {

            startActivity(Intent(this@MainActivity, PangasinanActivity::class.java))

        }

        findViewById<TextView>(R.id.helpCenter).setOnClickListener {

            startActivity(Intent(this@MainActivity, HelpCenterActivity::class.java))

        }

    }

}