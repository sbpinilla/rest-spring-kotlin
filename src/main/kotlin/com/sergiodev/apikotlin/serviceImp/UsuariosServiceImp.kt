package com.sergiodev.apikotlin.serviceImp

import com.sergiodev.apikotlin.dto.ResponseDTO
import com.sergiodev.apikotlin.dto.UsuarioDTO
import com.sergiodev.apikotlin.extension.toListUsuarioDTO
import com.sergiodev.apikotlin.repository.UsuarioRepository
import com.sergiodev.apikotlin.service.UsuariosService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.stereotype.Service

@Service
class UsuariosServiceImp: UsuariosService {

    @Autowired
    lateinit var usuarioRepository:UsuarioRepository

    override fun consultarUsuarios(): ResponseDTO {

        return ResponseDTO(usuarioRepository.findAll().toList().toListUsuarioDTO(),
                true,
                "OK",
                HttpStatus.OK)
    }


}