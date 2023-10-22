package com.example.sazakyanapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.widget.AppCompatButton
import com.example.sazakyanapp.profile.Database
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class EditActivity : AppCompatActivity() {

    private lateinit var button : AppCompatButton
    private lateinit var curPass : TextInputEditText
    private lateinit var newPass : TextInputEditText
    private lateinit var conNewPass : TextInputEditText
    private lateinit var database : Database

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit)

        curPass = findViewById<TextInputEditText>(R.id.currentPassword)
        newPass = findViewById<TextInputEditText>(R.id.newPassword)
        conNewPass = findViewById<TextInputEditText>(R.id.confirmNewPass)
        button = findViewById(R.id.button4)

        val userName = intent.getStringExtra("username")
        val passWord = intent.getStringExtra("password")
        val confirmPass = intent.getStringExtra("newpassword")
        database = Database(this)

        button.setOnClickListener {

            Log.d("Debug", "Entered Password: ${curPass.text.toString()}")
            Log.d("Debug", "Stored Password: ${newPass.text.toString()}")

            if (curPass.text.toString() == passWord) {

                if (newPass.text.toString().length >= 8) {

                    if (newPass.text.toString() == conNewPass.text.toString()) {

                        database.updateData(newPass.text.toString(), userName.toString())

                        val intent = Intent(this@EditActivity, HomeActivity::class.java)
                        intent.putExtra("username", userName)
                        intent.putExtra("password", passWord)
                        intent.putExtra("newpassword", confirmPass)
                        startActivity(intent)

                    } else {

                        Toast.makeText(this@EditActivity, "Password Doesn't Matched!", Toast.LENGTH_SHORT).show()

                    }

                } else {

                    Toast.makeText(this@EditActivity, "Enter Password more than 8 characters!", Toast.LENGTH_SHORT).show()
                }

            } else {

                Toast.makeText(this@EditActivity, "Current password doesn't matched!", Toast.LENGTH_SHORT).show()

            }
        }
    }
}