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

class LoginFragment : Fragment() {


    private lateinit var Binding : FragmentLoginBinding
    private lateinit var databaseHelper : DBHelper
    private lateinit var loginUsername : EditText
    private lateinit var loginPassword : EditText


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {


        Binding = FragmentLoginBinding.inflate(inflater, container, false)

        databaseHelper = DBHelper(this)

        Binding.confirmBtn2.setOnClickListener {

            val loginUsername = loginUsername.text.toString()
            val loginPassword = loginPassword.text.toString()
            loginDatabase(loginUsername, loginPassword)

        }

        Binding.confirmBtn2.setOnClickListener {

            findNavController().navigate(LoginFragmentDirections.actionLoginFragmentToCarsFragment())

        }

        return Binding.root

    }

    private fun loginDatabase (username: String, password: String) {

        val userExists = databaseHelper.readUser(username, password)
        if (userExists) {

            Toast.makeText(context, "Login Successful", Toast.LENGTH_SHORT).show()
            findNavController().navigate(LoginFragmentDirections.actionLoginFragmentToCarsFragment())

        } else {

            Toast.makeText(context, "Login Failed", Toast.LENGTH_SHORT).show()

        }

    }

}