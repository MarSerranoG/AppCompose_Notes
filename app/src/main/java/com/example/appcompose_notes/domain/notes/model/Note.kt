package com.example.appcompose_notes.domain.notes.model

import com.example.appcompose_notes.data.notes.model.NoteEntity

data class Note(
    val id: Int,
    val titleNote: String,
    val bodyNote: String
   // ,val locationNote: String
)

fun Note.toNoteEntity():NoteEntity = NoteEntity(uid = id, titleNote=titleNote, bodyNote= bodyNote)
fun NoteEntity.toNote(): Note=Note(id=uid, titleNote = titleNote, bodyNote=bodyNote)
