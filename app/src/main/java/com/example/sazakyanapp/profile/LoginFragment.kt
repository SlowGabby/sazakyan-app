package com.example.sazakyanapp.profile

import android.os.Bundle
import android.text.TextUtils
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.example.sazakyanapp.database.DBHelper
import com.example.sazakyanapp.R
import com.example.sazakyanapp.databinding.FragmentLoginBinding

class LoginFragment : Fragment() {

    private lateinit var Binding : FragmentLoginBinding
    private lateinit var loginBtn : Button
    private lateinit var editUser : EditText
    private lateinit var editPassword : EditText
    private lateinit var dbh : DBHelper

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        loginBtn.findViewById<Button>(R.id.btnLogin)
        editUser.findViewById<EditText>(R.id.etName2)
        editPassword.findViewById<EditText>(R.id.etPassword2)
        dbh = DBHelper(this)

        loginBtn.setOnClickListener {

            val userText = editUser.text.toString()
            val passText = editPassword.text.toString()

            if (TextUtils.isEmpty(userText) || TextUtils.isEmpty(passText)) {

                Toast.makeText(context, "Add Username and Password", Toast.LENGTH_SHORT).show()

            } else {

                val checkUser = dbh.checkUserPassword(userText, passText)

                if (checkUser == true) {

                    Toast.makeText(context, "Login Successfully", Toast.LENGTH_SHORT).show()
                    findNavController().navigate(LoginFragmentDirections.actionLoginFragmentToCarsFragment())

                } else {

                    Toast.makeText(context, "Wrong Credentials!", Toast.LENGTH_SHORT).show()

                }

            }
        }

        Binding = FragmentLoginBinding.inflate(inflater, container, false)

        Binding.confirmBtn2.setOnClickListener {

            findNavController().navigate(LoginFragmentDirections.actionLoginFragmentToCarsFragment())

        }

        return Binding.root

    }

}