package com.example.sazakyanapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.sazakyanapp.databinding.FragmentHondaBinding
import com.example.sazakyanapp.databinding.FragmentToyotaBinding

class ToyotaFragment : Fragment() {

    private lateinit var Binding : FragmentToyotaBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        Binding = FragmentToyotaBinding.inflate(inflater, container, false)



        Binding.toyotaOnly2.setOnClickListener() {

            findNavController().navigate(ToyotaFragmentDirections.actionToyotaFragmentToHondaFragment())

        }
        Binding.hondaOnly2.setOnClickListener() {

            findNavController().navigate(HondaFragmentDirections.actionHondaFragmentToToyotaFragment())

        }
        return Binding.root

    }

}