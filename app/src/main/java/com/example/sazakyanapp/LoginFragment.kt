package com.example.sazakyanapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.sazakyanapp.databinding.FragmentLoginBinding

class LoginFragment : Fragment() {

    private lateinit var Binding : FragmentLoginBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        Binding = FragmentLoginBinding.inflate(inflater, container, false)

        Binding.confirmBtn2.setOnClickListener {

            findNavController().navigate(LoginFragmentDirections.actionLoginFragmentToCarsFragment())

        }

        return Binding.root

    }

}