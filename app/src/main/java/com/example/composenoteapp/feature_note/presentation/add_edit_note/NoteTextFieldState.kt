package com.example.composenoteapp.feature_note.presentation.add_edit_note

data class NoteTextFieldState(
    val text: String = "",
    val hint: String = "",
    val isHintVisible: Boolean = true   // 아무것도 입력하지 않았을 땐 힌트가 보여야 한다
)
