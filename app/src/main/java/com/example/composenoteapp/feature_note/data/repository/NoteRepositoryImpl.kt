package com.example.composenoteapp.feature_note.data.repository

import com.example.composenoteapp.feature_note.data.datasource.NoteDao
import com.example.composenoteapp.feature_note.domain.model.Note
import com.example.composenoteapp.feature_note.domain.repository.NoteRepository
import kotlinx.coroutines.flow.Flow

// Note -> NoteDao -> NoteDatabase -> NoteRepository -> NoteRepositoryImpl 순으로 만듬
class NoteRepositoryImpl(
    private val dao: NoteDao
): NoteRepository {
    override fun getNotes(): Flow<List<Note>> = dao.getNotes()

    override suspend fun getNoteById(id: Int): Note? = dao.getNoteById(id)

    override suspend fun insertNote(note: Note) = dao.insertNote(note)

    override suspend fun deleteNote(note: Note) = dao.deleteNote(note)
}