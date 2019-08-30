package com.joshiraez.tictactoetdd.controller

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class TeaController {

    @GetMapping("tea")
    fun tea(): ResponseEntity<String> = ResponseEntity("want some tea?", HttpStatus.I_AM_A_TEAPOT)
}
