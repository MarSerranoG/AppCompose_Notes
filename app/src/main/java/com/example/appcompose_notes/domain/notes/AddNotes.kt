package com.example.appcompose_notes.domain.notes

import com.example.appcompose_notes.data.notes.NoteRepository
import com.example.appcompose_notes.domain.notes.model.Note
import com.example.appcompose_notes.domain.notes.model.toNoteEntity
import javax.inject.Inject

class AddNotes @Inject constructor(private val noteRepository: NoteRepository){
    suspend operator fun invoke (note:Note){
        noteRepository.insertNote(noteEntity = note.toNoteEntity())
    }
}