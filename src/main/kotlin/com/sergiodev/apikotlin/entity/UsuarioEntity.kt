package com.sergiodev.apikotlin.entity

import javax.persistence.*

@Entity
@Table(name = "USUARIO")

open class UsuarioEntity {

    @Column(name = "id", nullable = false)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Int? = null

    @get:Basic
    @get:Column(name = "nombre", nullable = false)
    var nombre: String? = null

    @get:Basic
    @get:Column(name = "Edad", nullable = false)
    var edad: Int? = null

    override fun toString(): String =
            "Entity of type: ${javaClass.name} ( " +
                    "id = $id " +
                    "nombre = $nombre " +
                    "edad = $edad " +
                    ")"

}

