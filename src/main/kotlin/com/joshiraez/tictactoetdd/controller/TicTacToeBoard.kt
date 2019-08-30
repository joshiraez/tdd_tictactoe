package com.joshiraez.tictactoetdd.controller

data class TicTacToeBoard(val board: List<List<Char>>)

fun emptyTicTacToeBoard() = TicTacToeBoard(listOf(emptyBoardRow(), emptyBoardRow(), emptyBoardRow()))

fun emptyBoardRow() = listOf(' ', ' ', ' ')

