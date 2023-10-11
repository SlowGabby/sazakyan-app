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
    private lateinit var database : DBHelper
    private lateinit var signupBtn : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        username = findViewById(R.id.editTextPersonName)
        password = findViewById(R.id.editTextPassword)
        checkPassword = findViewById(R.id.editTextPassword2)
        signupBtn = findViewById(R.id.button3)
        database = DBHelper(this)

        signupBtn.setOnClickListener {

            val userNameText = username.text.toString()
            val passwordText = password.text.toString()
            val checkPasswordText = checkPassword.text.toString()
            val saveData = database.insertdata(userNameText, passwordText)

            if (TextUtils.isEmpty(userNameText) || TextUtils.isEmpty(passwordText) || TextUtils.isEmpty(checkPasswordText)) {

                Toast.makeText(this, "Add Username, Password & Confirm Password", Toast.LENGTH_SHORT).show()

            } else {

                if (passwordText.equals(checkPasswordText)) {

                    if (saveData == true) {

                        Toast.makeText(this, "Signup Successful", Toast.LENGTH_SHORT).show()
                        val intent = Intent(applicationContext, LoginActivity::class.java)
                        startActivity(intent)

                    } else {

                        Toast.makeText(this, "User Exists", Toast.LENGTH_SHORT).show()

                    }
                } else {

                    Toast.makeText(this, "Wrong Password!", Toast.LENGTH_SHORT).show()

                }
            }
        }
    }
}