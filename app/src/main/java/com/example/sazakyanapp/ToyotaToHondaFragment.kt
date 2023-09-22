package com.example.sazakyanapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.sazakyanapp.databinding.FragmentToyotaToHondaBinding


class ToyotaToHondaFragment : Fragment() {

    private lateinit var Binding : FragmentToyotaToHondaBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        Binding = FragmentToyotaToHondaBinding.inflate(inflater, container, false)

        Binding.toyotaOnly2.setOnClickListener {

            findNavController().navigate(ToyotaToHondaFragmentDirections.actionToyotaToHondaFragmentToToyotaFragment3())

        }

        return Binding.root

    }

}