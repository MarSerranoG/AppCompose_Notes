package com.example.appcompose_notes.domain.notes

import com.example.appcompose_notes.data.notes.NoteRepository
import com.example.appcompose_notes.domain.notes.model.Note
import com.example.appcompose_notes.domain.notes.model.toNote
import javax.inject.Inject

class GetNotes {
    class GetNotes @Inject constructor(private val noteRepository: NoteRepository){
        suspend operator fun invoke(): List<Note>{
            return noteRepository.getAllNotes().map { it.toNote()}
        }
    }
}