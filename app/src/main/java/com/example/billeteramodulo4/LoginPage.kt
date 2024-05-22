package com.example.billeteramodulo4

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.example.billeteramodulo4.databinding.FragmentLoginPageBinding
import com.example.billeteramodulo4.viewmodel.LoginPageViewModel

class LoginPage : Fragment() {

    private lateinit var binding: FragmentLoginPageBinding

    private val viewModel: LoginPageViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = FragmentLoginPageBinding.inflate(inflater, container, false)
        val root = binding.root

        binding.crearUnaNuevaCuentaLogin.setOnClickListener {

            findNavController().navigate(R.id.action_loginPageFragment_to_singupPageFragment)

        }

        binding.btnLogin.setOnClickListener {
            findNavController().navigate(R.id.action_loginPageFragment_to_homePageEmptyCase)
        }

        return root
    }
}