package com.example.sazakyanapp.profile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.sazakyanapp.R
import com.example.sazakyanapp.database.DBHelper
import com.example.sazakyanapp.databinding.ActivitySignUpBinding

class SignUpActivity : AppCompatActivity() {

    private lateinit var binding : ActivitySignUpBinding
    private lateinit var dbHelper : DBHelper

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySignUpBinding.inflate(layoutInflater)

        setContentView(R.layout.activity_sign_up)

        dbHelper = DBHelper(this)

        binding.signupBtn.setOnClickListener {

            val signupUsername = binding.signupUsername.text.toString()
            val signupPassword = binding.signupPassword.text.toString()
            val signupConfirmPassword = binding.signupConfirmPassword.text.toString()
            signupDatabase(signupUsername, signupPassword, signupConfirmPassword)

        }

        binding.signupBtn.setOnClickListener {

            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
            finish()

        }
    }

    private fun signupDatabase(username : String, password : String, confirmPassword : String) {

        val insertedRowId = dbHelper.insertUser(username, password, confirmPassword)
        if (insertedRowId != -1L) {
            Toast.makeText(this, "Signup Successful", Toast.LENGTH_SHORT).show()
            startActivity(Intent(this@SignUpActivity, LoginActivity::class.java))
            finish()

        } else {
            Toast.makeText(this, "Signup Failed!", Toast.LENGTH_SHORT).show()
        }
    }
}