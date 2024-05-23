package com.example.billeteramodulo4.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class LoginPageViewModel : ViewModel() {

    private val _correo = MutableLiveData<String?>()
    val correo: LiveData<String?> get() = _correo

    private val _password = MutableLiveData<String?>()
    val password: LiveData<String?> get() = _password


    private val _validarUsuario = MutableLiveData<Boolean>()
    val validarUsuario: LiveData<Boolean> get() = _validarUsuario


    fun validarCorreo(correo: String, password: String) {
        _correo.value = correo
        _password.value = password
        validarUsuario()
    }

    private fun validarUsuario() {
        _validarUsuario.value = !(correo.value.isNullOrEmpty() || password.value.isNullOrEmpty())
    }

}