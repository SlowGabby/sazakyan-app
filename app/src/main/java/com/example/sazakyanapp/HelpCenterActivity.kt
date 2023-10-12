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

        val githubIcon : ImageView = findViewById(R.id.githubIcon)
        val facebookIcon : ImageView = findViewById(R.id.facebookIcon)
        val instagramIcon : ImageView = findViewById(R.id.instagramIcon)
        val helpcenterBackBtn : ImageView = findViewById(R.id.helpCenterBackBtn)

        binding = ActivityHelpCenterBinding.inflate(layoutInflater)

        facebookIcon.setOnClickListener {

            val openURL = Intent(android.content.Intent.ACTION_VIEW)
            openURL.data = Uri.parse("https://www.facebook.com/profile.php?id=61551931515185&mibextid=2JQ9oc")
            startActivity(openURL)

        }

        instagramIcon.setOnClickListener {

            val openURL = Intent(android.content.Intent.ACTION_VIEW)
            openURL.data = Uri.parse("https://github.com/Rdavee/sazakyan-app")
            startActivity(openURL)

        }

        githubIcon.setOnClickListener {

            val openURL = Intent(android.content.Intent.ACTION_VIEW)
            openURL.data = Uri.parse("https://github.com/Rdavee/sazakyan-app")
            startActivity(openURL)

        }

        helpcenterBackBtn.setOnClickListener {

            startActivity(Intent(this@HelpCenterActivity, HomeActivity::class.java))

        }
    }
}