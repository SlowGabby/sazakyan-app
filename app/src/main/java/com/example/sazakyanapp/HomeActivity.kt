package com.example.sazakyanapp

import android.content.Intent
import android.graphics.drawable.Drawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AlertDialog
import androidx.cardview.widget.CardView
import androidx.drawerlayout.widget.DrawerLayout
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
import com.example.sazakyanapp.profile.Database
import com.example.sazakyanapp.profile.LoginActivity
import com.example.sazakyanapp.vigan.ViganActivity
import com.google.android.material.navigation.NavigationView

class HomeActivity : AppCompatActivity() {

    private lateinit var imageSlider : ImageSlider
    private lateinit var drawerLayout : DrawerLayout
    private lateinit var toggle : ActionBarDrawerToggle
    private lateinit var database : Database

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_home)

        drawerLayout = findViewById<DrawerLayout>(R.id.drawerLayout)
        val navView : NavigationView = findViewById(R.id.nav_view)
        toggle = ActionBarDrawerToggle(this, drawerLayout, R.string.open, R.string.close)
        drawerLayout.addDrawerListener(toggle)
        toggle.syncState()
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val artDialogBuilder = AlertDialog.Builder(this)
        val insertedUser = intent.getStringExtra("username")
        val insertedEmail = intent.getStringExtra("email")
        val insertedContact = intent.getStringExtra("contact")
        val insertedPass = intent.getStringExtra("password")

        val userName = intent.getStringExtra("username")
        val passWord = intent.getStringExtra("password")
        val confirmPass = intent.getStringExtra("newpassword")

        database = Database(this)

        navView.setNavigationItemSelectedListener {

            when(it.itemId) {

                R.id.nav_home -> {
                    val intent = Intent(this@HomeActivity, HomeActivity::class.java)
                    startActivity(intent)
                    this@HomeActivity.overridePendingTransition(
                        R.anim.animate_fade_enter,
                        R.anim.animate_fade_exit
                    )
                    finish()
                }

                R.id.nav_history-> {
                    val intent = Intent(this@HomeActivity, HistoryActivity::class.java)
                    startActivity(intent)
                    this@HomeActivity.overridePendingTransition(
                        R.anim.animate_fade_enter,
                        R.anim.animate_fade_exit
                    )
                    finish()
                }

                R.id.nav_edit_user -> {

                    val intent = Intent(this@HomeActivity, EditActivity::class.java)
                    intent.putExtra("username", insertedUser)
                    intent.putExtra("password", insertedPass)
                    startActivity(intent)
                    this@HomeActivity.overridePendingTransition(
                        R.anim.animate_fade_enter,
                        R.anim.animate_fade_exit

                    )
                }

                R.id.nav_delete_user -> {
                    artDialogBuilder.setTitle("Delete")
                    artDialogBuilder.setMessage("Are you sure you want to delete your account?")
                    artDialogBuilder.setCancelable(false)
                    artDialogBuilder.setPositiveButton("Yes") {_, _ ->

                        database.deleteUser(insertedUser.toString())
                        database.deleteUser(insertedEmail.toString())
                        database.deleteUser(insertedContact.toString())
                        database.deleteUser(insertedPass.toString())

                        val intent = Intent(this@HomeActivity, LoginActivity::class.java)
                        startActivity(intent)
                        this@HomeActivity.overridePendingTransition(
                            R.anim.animate_fade_enter,
                            R.anim.animate_fade_exit
                        )
                    }

                    artDialogBuilder.setNegativeButton("No") {_, _ ->

                    }

                    val alertDialogBox = artDialogBuilder.create()
                    alertDialogBox.show()

                }

                R.id.nav_logout -> {

                    artDialogBuilder.setTitle("Log Out")
                    artDialogBuilder.setMessage("Are you sure you want to sign out?")
                    artDialogBuilder.setCancelable(false)
                    artDialogBuilder.setPositiveButton("Yes") { _, _ ->
                        startActivity(Intent(this@HomeActivity, LoginActivity::class.java))
                        finish()

                    }

                    artDialogBuilder.setNegativeButton("No") { _, _ ->

                    }

                    val alertDialogBox = artDialogBuilder.create()
                    alertDialogBox.show()

                }
            }

            true

        }

        fun onOptionsItemSelected(item: MenuItem): Boolean {

            if (toggle.onOptionsItemSelected(item)) {

                return true

            }

            return super.onOptionsItemSelected(item)

        }


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