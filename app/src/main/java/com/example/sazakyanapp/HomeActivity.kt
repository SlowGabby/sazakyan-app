package com.example.sazakyanapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.cardview.widget.CardView
import androidx.drawerlayout.widget.DrawerLayout
import com.denzcoskun.imageslider.ImageSlider
import com.denzcoskun.imageslider.constants.ScaleTypes
import com.denzcoskun.imageslider.models.SlideModel
import com.example.sazakyanapp.descriptions.HiaceDescription
import com.example.sazakyanapp.descriptions.LandcruiserDescription
import com.example.sazakyanapp.descriptions.RaptorDescription
import com.example.sazakyanapp.descriptions.ViosDescription
import com.example.sazakyanapp.pangasinan.PangasinanActivity
import com.google.android.material.navigation.NavigationView

class HomeActivity : AppCompatActivity() {

    private lateinit var imageSlider : ImageSlider


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_home)

//        IMAGE SLIDER TODO: NEED TO UPDATE THE IMAGES

        imageSlider = findViewById(R.id.imageSlider)

        val imagesList = ArrayList<SlideModel>()
        imagesList.add(SlideModel(R.drawable.first_promo))
        imagesList.add(SlideModel(R.drawable.promo_bg))
        imagesList.add(SlideModel(R.drawable.me))

        imageSlider.setImageList(imagesList, ScaleTypes.CENTER_INSIDE)


//        BROWSE BY LOCATION TODO: NEED TO IMPLEMENT ALL THE FUNCTION HERE (DONE)


        findViewById<CardView>(R.id.dagupanOnly).setOnClickListener {

            startActivity(Intent(this@HomeActivity, PangasinanActivity::class.java))
            this@HomeActivity.overridePendingTransition(
                R.anim.animate_fade_enter,
                R.anim.animate_fade_exit
            )

        }

//        DESCRIPTIONS OF SPECIFIC CARS

        findViewById<CardView>(R.id.viosCardView).setOnClickListener {

            startActivity(Intent(this@HomeActivity, ViosDescription::class.java))
            this@HomeActivity.overridePendingTransition(
                R.anim.animate_fade_enter,
                R.anim.animate_fade_exit
            )


        }

        findViewById<CardView>(R.id.raptorCardView).setOnClickListener {

            startActivity(Intent(this@HomeActivity, RaptorDescription::class.java))
            this@HomeActivity.overridePendingTransition(
                R.anim.animate_fade_enter,
                R.anim.animate_fade_exit
            )


        }

        findViewById<CardView>(R.id.hiaceCardView).setOnClickListener {

            startActivity(Intent(this@HomeActivity, HiaceDescription::class.java))
            this@HomeActivity.overridePendingTransition(
                R.anim.animate_fade_enter,
                R.anim.animate_fade_exit
            )


        }

        findViewById<CardView>(R.id.landcruiserCardView).setOnClickListener {

            startActivity(Intent(this@HomeActivity, LandcruiserDescription::class.java))
            this@HomeActivity.overridePendingTransition(
                R.anim.animate_fade_enter,
                R.anim.animate_fade_exit
            )


        }

//        HELP CENTER OR FAQS

        findViewById<TextView>(R.id.helpCenter).setOnClickListener {

            startActivity(Intent(this@HomeActivity, HelpCenterActivity::class.java))
            this@HomeActivity.overridePendingTransition(
                R.anim.animate_fade_enter,
                R.anim.animate_fade_exit
            )
        }
    }
}
