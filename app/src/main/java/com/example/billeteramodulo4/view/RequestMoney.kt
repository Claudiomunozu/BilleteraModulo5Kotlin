package com.example.billeteramodulo4.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.billeteramodulo4.R
import com.example.billeteramodulo4.databinding.FragmentRequestMoneyBinding


class RequestMoney : Fragment() {

    private lateinit var binding: FragmentRequestMoneyBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = FragmentRequestMoneyBinding.inflate(layoutInflater)
        val root = binding.root
        // Inflate the layout for this fragment

        binding.btnenviarequestmoneypage.setOnClickListener {
            findNavController().navigate(R.id.action_requestMoney_to_homePage)
        }

        return root
    }


}