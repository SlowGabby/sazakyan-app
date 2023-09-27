package com.example.sazakyanapp.profile

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.example.sazakyanapp.database.DBHelper
import com.example.sazakyanapp.databinding.FragmentLoginBinding

class SignupFragment : Fragment() {


    private lateinit var Binding : FragmentLoginBinding
    private lateinit var databaseHelper : DBHelper
    private lateinit var signupUsername : EditText
    private lateinit var signupPassword : EditText


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {


        Binding = FragmentLoginBinding.inflate(inflater, container, false)

//        databaseHelper = DBHelper(this)

        Binding.confirmBtn2.setOnClickListener {

            val signupUsername = signupUsername.text.toString()
            val signupPassword = signupPassword.text.toString()
            signupDatabase(signupUsername, signupPassword)

        }

        Binding.confirmBtn2.setOnClickListener {


        }

        return Binding.root


    }

    private fun signupDatabase (username: String, password: String) {

        val insertedRowId = databaseHelper.insertUser(username, password)

        if (insertedRowId != -1L) {

            Toast.makeText(context, "Signup Successfully", Toast.LENGTH_SHORT).show()

        } else {

            Toast.makeText(context, "Signup Failed", Toast.LENGTH_SHORT).show()

        }

    }

}