package com.example.composenoteapp.feature_note.domain.usecases

import com.example.composenoteapp.feature_note.domain.model.Note
import com.example.composenoteapp.feature_note.domain.repository.NoteRepository

class DeleteNoteUseCase(
    private val repository: NoteRepository
) {
    suspend operator fun invoke(note: Note) = repository.deleteNote(note)
}