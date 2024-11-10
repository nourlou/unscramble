package com.example.unscramble.ui.theme
import com.example.unscramble.data.SCORE_INCREASE

data class GameUiState(
    val currentScrambledWord: String = "",
    val isGuessedWordWrong: Boolean = false,
    val score: Int = 0,
    val currentWordCount: Int = 1,


)
