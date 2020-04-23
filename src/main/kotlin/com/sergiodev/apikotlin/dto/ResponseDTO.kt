package com.sergiodev.apikotlin.dto

import org.springframework.http.HttpStatus

class ResponseDTO(val datos:Any,val exito:Boolean,val mensaje:String,val estatus:HttpStatus) {
}