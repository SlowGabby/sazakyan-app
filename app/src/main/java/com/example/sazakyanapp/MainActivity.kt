package com.example.sazakyanapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.denzcoskun.imageslider.ImageSlider
import com.denzcoskun.imageslider.constants.ScaleTypes
import com.denzcoskun.imageslider.models.SlideModel
import com.example.sazakyanapp.sedan.MainHomeActivity
import com.google.android.material.bottomnavigation.BottomNavigationView

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
        imagesList.add(SlideModel("https://cdn.sixt.io/cms/originals/cebff417-98e6-4f28-b698-feeea6b46fd5.png"))
        imagesList.add(SlideModel("https://socar-my-website.s3.ap-southeast-1.amazonaws.com/socar-my/Rjra4EF3kEqKHeOBAoDJqg2PFmEiqacN5PS53pct.jpeg"))
        imagesList.add(SlideModel("https://rayyancarrental.com/wp-content/uploads/2023/03/promo-raya-.png"))

        imageSlider.setImageList(imagesList, ScaleTypes.CENTER_INSIDE)


//        BROWSE BY LOCATION FUNCTIONS/INTENTS


        findViewById<CardView>(R.id.dagupanOnly).setOnClickListener {

            startActivity(Intent(this@MainActivity, MainHomeActivity::class.java))

        }

    }

}