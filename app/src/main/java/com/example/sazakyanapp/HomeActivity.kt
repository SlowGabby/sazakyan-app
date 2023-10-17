package com.example.sazakyanapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import com.denzcoskun.imageslider.ImageSlider
import com.denzcoskun.imageslider.constants.ScaleTypes
import com.denzcoskun.imageslider.models.SlideModel
import com.example.sazakyanapp.descriptions.HiaceDescription
import com.example.sazakyanapp.descriptions.LandcruiserDescription
import com.example.sazakyanapp.descriptions.RaptorDescription
import com.example.sazakyanapp.descriptions.ViosDescription
import com.example.sazakyanapp.makati.MakatiActivity
import com.example.sazakyanapp.manila.ManilaActivity
import com.example.sazakyanapp.pangasinan.PangasinanActivity
import com.example.sazakyanapp.vigan.ViganActivity

class HomeActivity : AppCompatActivity() {

    private lateinit var imageSlider : ImageSlider

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_home)

        //  BROWSE BY LOCATION TODO: NEED TO IMPLEMENT ALL THE FUNCTION HERE (IMPLEMENTING)

        findViewById<CardView>(R.id.dagupanOnly).setOnClickListener {

            startActivity(Intent(this@HomeActivity, PangasinanActivity::class.java))
            this@HomeActivity.overridePendingTransition(
                R.anim.animate_fade_enter,
                R.anim.animate_fade_exit
            )
        }

        findViewById<ImageView>(R.id.makatiImage).setOnClickListener {

            startActivity(Intent(this@HomeActivity, MakatiActivity::class.java))
            this@HomeActivity.overridePendingTransition(
                R.anim.animate_fade_enter,
                R.anim.animate_fade_exit
            )
        }

        findViewById<ImageView>(R.id.manilaImage).setOnClickListener {

            startActivity(Intent(this@HomeActivity, ManilaActivity::class.java))
            this@HomeActivity.overridePendingTransition(
                R.anim.animate_fade_enter,
                R.anim.animate_fade_exit
            )
        }

        findViewById<ImageView>(R.id.viganImage).setOnClickListener {

            startActivity(Intent(this@HomeActivity, ViganActivity::class.java))
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

        findViewById<ImageView>(R.id.raptorImage).setOnClickListener {

            startActivity(Intent(this@HomeActivity, RaptorDescription::class.java))
            this@HomeActivity.overridePendingTransition(
                R.anim.animate_fade_enter,
                R.anim.animate_fade_exit
            )
        }

        findViewById<ImageView>(R.id.hiaceImage).setOnClickListener {

            startActivity(Intent(this@HomeActivity, HiaceDescription::class.java))
            this@HomeActivity.overridePendingTransition(
                R.anim.animate_fade_enter,
                R.anim.animate_fade_exit
            )
        }

        findViewById<ImageView>(R.id.landcruiserImage).setOnClickListener {

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

//        IMAGE SLIDER TODO: NEED TO UPDATE THE IMAGES

        imageSlider = findViewById(R.id.imageSlider)

        val imagesList = ArrayList<SlideModel>()

        imagesList.add(SlideModel(R.drawable.promo_one))
        imagesList.add(SlideModel(R.drawable.promo_one))
        imagesList.add(SlideModel(R.drawable.promo_one))

        imageSlider.setImageList(imagesList, ScaleTypes.CENTER_INSIDE)

    }
}
