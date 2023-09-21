package com.example.sazakyanapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.sazakyanapp.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private lateinit var Binding : FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        Binding = FragmentHomeBinding.inflate(inflater, container, false)

        Binding.btnLogin.setOnClickListener {

            findNavController().navigate(HomeFragmentDirections.actionHomeFragmentToCarsFragment())

        }

        return Binding.root

    }
}
