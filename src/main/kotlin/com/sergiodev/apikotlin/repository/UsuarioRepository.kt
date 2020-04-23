package com.sergiodev.apikotlin.repository

import com.sergiodev.apikotlin.entity.UsuarioEntity
import org.springframework.data.repository.CrudRepository

interface UsuarioRepository:CrudRepository<UsuarioEntity,Int> {

}