package com.joshiraez.tictactoetdd.controller

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class PlayController {

    @GetMapping("/v1/play")
    fun play(board: TicTacToeAction?): ResponseEntity<TicTacToeBoard> {

        return ResponseEntity.ok(emptyTicTacToeBoard())
    }


}
