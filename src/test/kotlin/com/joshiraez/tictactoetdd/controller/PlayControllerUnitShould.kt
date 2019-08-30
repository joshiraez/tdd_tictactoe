package com.joshiraez.tictactoetdd.controller

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test
import org.springframework.http.HttpStatus.OK

class PlayControllerUnitShould {

    private val playController = PlayController()

    @Test
    fun `return an empty board when input action is empty`() {
        //Given
        val emptyAction = null

        //When
        val response = playController.play(emptyAction)

        //Then
        assertThat(response.statusCode).isEqualTo(OK)
        assertThat(response.body).isEqualTo(emptyBoard())
    }

    private fun emptyBoard() = emptyTicTacToeBoard()
}
