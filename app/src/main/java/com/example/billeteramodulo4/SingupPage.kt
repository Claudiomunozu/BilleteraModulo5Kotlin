package com.example.billeteramodulo4

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.example.billeteramodulo4.databinding.FragmentSingupPageBinding
import com.example.billeteramodulo4.viewmodel.SingupPageViewModel

class SingupPage : Fragment() {

    private lateinit var binding: FragmentSingupPageBinding

    private val viewModel: SingupPageViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = FragmentSingupPageBinding.inflate(inflater, container, false)
        val root = binding.root

        binding.yatienescuentasinguppage.setOnClickListener {

            findNavController().navigate(R.id.action_singupPageFragment_to_loginPageFragment)

        }

        binding.crearcuenta.setOnClickListener {
            findNavController().navigate(R.id.action_singupPageFragment_to_homePageEmptyCase)

        }
        return root
    }
}

