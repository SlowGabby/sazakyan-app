package com.example.sazakyanapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import androidx.navigation.fragment.findNavController
import com.example.sazakyanapp.databinding.FragmentSignupBinding

class SignupFragment : Fragment() {

    private lateinit var Binding : FragmentSignupBinding
    private lateinit var userName : EditText
    private lateinit var passWord : EditText
    private lateinit var checkPassword : EditText
    private lateinit var db : DBHelper

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {


        Binding = FragmentSignupBinding.inflate(inflater, container, false)

        Binding.confirmBtn.setOnClickListener {

            findNavController().navigate(SignupFragmentDirections.actionSignupFragmentToCarsFragment())

        }

        return Binding.root

    }

}