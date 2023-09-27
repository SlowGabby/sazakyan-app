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


        }

        Binding.vios.setOnClickListener {


        }

        Binding.hiace.setOnClickListener {


        }

        Binding.toyota2.setOnClickListener {


        }

        Binding.toyota3.setOnClickListener {


        }


//      HONDA FUNCTIONALITY

        Binding.hondaOnly.setOnClickListener {


        }

        Binding.honda1.setOnClickListener {


        }

        Binding.honda2.setOnClickListener {


        }

        Binding.honda3.setOnClickListener {


        }

        Binding.honda4.setOnClickListener {


        }

        return Binding.root

    }

}