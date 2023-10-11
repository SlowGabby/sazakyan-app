package com.example.sazakyanapp

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.example.sazakyanapp.databinding.ActivityHelpCenterBinding

class HelpCenterActivity : AppCompatActivity() {

    private lateinit var binding : ActivityHelpCenterBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_help_center)

        binding = ActivityHelpCenterBinding.inflate(layoutInflater)

        binding.facebookIcon.setOnClickListener {

            openUrl("https://facebook.com/rdaavee")
        }

        binding.instagramIcon.setOnClickListener {

            openUrl("https://instagram.com/rdaavee")
        }

        binding.githubIcon.setOnClickListener {

            openUrl("https://github.com/Rdavee/sazakyan-app")
        }


        findViewById<ImageView>(R.id.helpCenterBackBtn).setOnClickListener {

            startActivity(Intent(this@HelpCenterActivity, MainActivity::class.java))

        }
    }

    private fun openUrl(link: String) {

        val uri = Uri.parse(link)
        val intent = Intent(Intent.ACTION_VIEW, uri)

        startActivity(intent)

    }
}