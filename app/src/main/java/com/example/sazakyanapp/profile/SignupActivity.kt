package com.example.sazakyanapp.profile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.sazakyanapp.R

class SignupActivity : AppCompatActivity() {

    private lateinit var username : EditText
    private lateinit var password : EditText
    private lateinit var checkPassword : EditText
    private lateinit var email : EditText
    private lateinit var contact : EditText
    private lateinit var database : Database
    private lateinit var signupBtn : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        username = findViewById(R.id.editTextPersonName)
        password = findViewById(R.id.editTextPassword)
        checkPassword = findViewById(R.id.editTextPassword2)
        signupBtn = findViewById(R.id.button3)
        email = findViewById(R.id.editTextEmail)
        contact = findViewById(R.id.editTextContactNumber)
        database = Database(this)

        signupBtn.setOnClickListener {

            val signupUser = username.text.toString()
            val signupPassword = password.text.toString()
            val signupCpassword = checkPassword.text.toString()
            val signupEmail = email.text.toString()
            val signupContact = contact.text.toString()
            val saveData = database.insertdata(signupUser, signupEmail, signupContact, signupPassword)

            if (TextUtils.isEmpty(signupUser) || TextUtils.isEmpty(signupPassword) || TextUtils.isEmpty(signupCpassword)) {

                Toast.makeText(this, "Add Username, Password & Confirm Password", Toast.LENGTH_SHORT).show()

            } else {

                if (signupPassword == (signupCpassword)) {

                    if (saveData == true) {

                        Toast.makeText(this, "Signup Successful", Toast.LENGTH_SHORT).show()
                        val intent = Intent(applicationContext, LoginActivity::class.java)
                        startActivity(intent)
                        this@SignupActivity.overridePendingTransition(
                            R.anim.animate_fade_enter,
                            R.anim.animate_fade_exit
                        )

                    } else {

                        Toast.makeText(this, "User Exists!", Toast.LENGTH_SHORT).show()

                    }

                } else {

                    Toast.makeText(this, "Wrong Password!", Toast.LENGTH_SHORT).show()

                }
            }
        }
    }
}