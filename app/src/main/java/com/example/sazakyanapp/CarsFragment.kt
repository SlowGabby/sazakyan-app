package com.example.sazakyanapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.sazakyanapp.databinding.FragmentCarsBinding

class CarsFragment : Fragment() {

    private lateinit var Binding : FragmentCarsBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        Binding = FragmentCarsBinding.inflate(inflater, container, false)


//        TOYOTA FUNCTIONALITY

        Binding.toyotaOnly.setOnClickListener {

            findNavController().navigate(CarsFragmentDirections.actionCarsFragmentToToyotaFragment3())

        }

        Binding.vios.setOnClickListener {

            findNavController().navigate(CarsFragmentDirections.actionCarsFragmentToDescriptionFragment2())

        }

        Binding.hiace.setOnClickListener {

            findNavController().navigate(CarsFragmentDirections.actionCarsFragmentToDescriptionFragment2())

        }

        Binding.toyota2.setOnClickListener {

            findNavController().navigate(CarsFragmentDirections.actionCarsFragmentToDescriptionFragment2())

        }

        Binding.toyota3.setOnClickListener {

            findNavController().navigate(CarsFragmentDirections.actionCarsFragmentToDescriptionFragment2())

        }


//      HONDA FUNCTIONALITY

        Binding.hondaOnly.setOnClickListener {

            findNavController().navigate(CarsFragmentDirections.actionCarsFragmentToHondaFragment2())

        }

        Binding.honda1.setOnClickListener {

            findNavController().navigate(CarsFragmentDirections.actionCarsFragmentToDescriptionFragment2())

        }

        Binding.honda2.setOnClickListener {

            findNavController().navigate(CarsFragmentDirections.actionCarsFragmentToDescriptionFragment2())

        }

        Binding.honda3.setOnClickListener {

            findNavController().navigate(CarsFragmentDirections.actionCarsFragmentToDescriptionFragment2())

        }

        Binding.honda4.setOnClickListener {

            findNavController().navigate(CarsFragmentDirections.actionCarsFragmentToDescriptionFragment2())

        }

        return Binding.root

    }

}