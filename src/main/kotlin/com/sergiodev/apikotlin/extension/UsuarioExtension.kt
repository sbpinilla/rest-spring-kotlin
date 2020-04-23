package com.sergiodev.apikotlin.extension

import com.sergiodev.apikotlin.dto.UsuarioDTO
import com.sergiodev.apikotlin.entity.UsuarioEntity

fun UsuarioEntity.toUsuarioDTO()=UsuarioDTO(this.id,this.nombre,this.edad)

fun UsuarioDTO.toUsuarioEntity():UsuarioEntity{

    val usuarioEntity = UsuarioEntity()
    usuarioEntity.id = this.id
    usuarioEntity.nombre = this.nombre
    usuarioEntity.edad = this.edad

    return  usuarioEntity

}

fun List<UsuarioEntity>.toListUsuarioDTO():List<UsuarioDTO> {
    val list:MutableList<UsuarioDTO> = mutableListOf()
    for (data in this) {

        val usuarioDTO = UsuarioDTO(data.id,data.nombre,data.edad)
        list.add(usuarioDTO)
    }
    return list
}


fun List<UsuarioEntity>.toListUsuarioEntity():List<UsuarioEntity> {
    val list:MutableList<UsuarioEntity> = mutableListOf()
    for (data in this) {

        val usuarioEntity = UsuarioEntity()
        usuarioEntity.id = data.id
        usuarioEntity.nombre = data.nombre
        usuarioEntity.edad = data.edad
        list.toMutableList().add(usuarioEntity)
    }
    return list
}