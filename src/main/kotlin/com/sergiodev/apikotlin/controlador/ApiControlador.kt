package com.sergiodev.apikotlin.controlador

import com.sergiodev.apikotlin.dto.UsuarioDTO
import com.sergiodev.apikotlin.service.UsuariosService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/kotlin")
class ApiControlador {

    @Autowired
    lateinit var service:UsuariosService

    @GetMapping("/usuarios")
    fun consultarUsuarios() = service.consultarUsuarios()

}

