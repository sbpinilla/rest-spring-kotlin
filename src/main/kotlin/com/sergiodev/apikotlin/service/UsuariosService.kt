package com.sergiodev.apikotlin.service

import com.sergiodev.apikotlin.dto.ResponseDTO


interface UsuariosService {
    fun consultarUsuarios(): ResponseDTO
}