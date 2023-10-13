package com.example.sazakyanapp.profile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.sazakyanapp.HomeActivity
import com.example.sazakyanapp.MainActivity
import com.example.sazakyanapp.R

class LoginActivity : AppCompatActivity() {

    private lateinit var loginBtn : Button
    private lateinit var editUser : EditText
    private lateinit var editPassword : EditText
    private lateinit var databaseHelper : DBHelper

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        loginBtn = findViewById(R.id.button4)
        editUser = findViewById(R.id.editTextPersonName2)
        editPassword = findViewById(R.id.editTextPassword3)
        databaseHelper = DBHelper(this)

        loginBtn.setOnClickListener {

            val useredtx = editUser.text.toString()
            val passedtx = editPassword.text.toString()


            if (TextUtils.isEmpty(useredtx) || TextUtils.isEmpty(passedtx)) {

                Toast.makeText(this, "Add Username & Password!", Toast.LENGTH_SHORT).show()

            } else {

                val checkUser = databaseHelper.checkuserpass(useredtx, passedtx)
                if (checkUser == true) {

                    Toast.makeText(this, "Login Successful", Toast.LENGTH_SHORT).show()
                    val intent = Intent(applicationContext, HomeActivity::class.java)
                    startActivity(intent)
                    this@LoginActivity.overridePendingTransition(
                        R.anim.animate_fade_enter,
                        R.anim.animate_fade_exit
                    )

                } else {

                    Toast.makeText(this, "Wrong Credentials!", Toast.LENGTH_SHORT).show()

                }
            }
        }
    }
}