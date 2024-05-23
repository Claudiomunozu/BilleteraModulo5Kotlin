package com.example.billeteramodulo4.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.billeteramodulo4.R
import com.example.billeteramodulo4.databinding.FragmentSendMoneyBinding


class SendMoney : Fragment() {

    private lateinit var binding: FragmentSendMoneyBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = FragmentSendMoneyBinding.inflate(inflater, container, false)
        val root = binding.root

        binding.btnenviadinerosendpage.setOnClickListener {
            findNavController().navigate(R.id.action_sendMoney_to_homePage)
        }

        return root
    }

}