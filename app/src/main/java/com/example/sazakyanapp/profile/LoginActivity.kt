package com.example.sazakyanapp.profile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.example.sazakyanapp.HomeActivity
import com.example.sazakyanapp.R
import com.google.android.material.textfield.TextInputEditText


class LoginActivity : AppCompatActivity() {

    private lateinit var loginBtn : Button
    private lateinit var editUser : TextInputEditText
    private lateinit var editPassword : TextInputEditText
    private lateinit var loginEmail : TextInputEditText
    private lateinit var loginContact : TextInputEditText
    private lateinit var databaseHelper : Database

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        loginBtn = findViewById(R.id.button4)
        editUser = findViewById(R.id.editTextPersonName2)
        editPassword = findViewById(R.id.editTextPassword3)
        loginEmail = findViewById(R.id.editTextEmail2)
        loginContact = findViewById(R.id.editContactNumber2)
        databaseHelper = Database(this)

        loginBtn.setOnClickListener {

            val insertedUser = editUser.text.toString()
            val insertedPass = editPassword.text.toString()
            val insertedEmail = loginEmail.text.toString()
            val insertedContact = loginContact.text.toString()


            if (TextUtils.isEmpty(insertedUser) || TextUtils.isEmpty(insertedPass)) {

                Toast.makeText(this, "Add Username & Password!", Toast.LENGTH_SHORT).show()

            } else {

                val checkUser = databaseHelper.checkuserpass(insertedUser, insertedPass, insertedEmail, insertedContact)
                if (checkUser == true) {

                    Toast.makeText(this, "Login Successful", Toast.LENGTH_SHORT).show()
                    val intent = Intent(applicationContext, HomeActivity::class.java)
                    intent.putExtra("username", insertedUser)
                    intent.putExtra("password", insertedPass)
                    intent.putExtra("email", insertedEmail)
                    intent.putExtra("contact", insertedContact)
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

        findViewById<TextView>(R.id.signupRedirect).setOnClickListener {

            startActivity(Intent(this@LoginActivity, SignupActivity::class.java))
            this@LoginActivity.overridePendingTransition(
                R.anim.animate_fade_enter,
                R.anim.animate_fade_exit
            )

        }
    }
}