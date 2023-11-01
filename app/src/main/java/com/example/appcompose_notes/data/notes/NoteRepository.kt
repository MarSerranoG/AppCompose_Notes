package com.example.appcompose_notes.data.notes

import com.example.appcompose_notes.data.notes.local.NoteDao
import com.example.appcompose_notes.data.notes.model.NoteEntity
import  javax.inject.Inject
class NoteRepository @Inject constructor(
    private val noteDao: NoteDao
) {

    fun getAllNotes():List<NoteEntity> {
        return noteDao.getAll()
    }


    fun insertNote(noteEntity: NoteEntity){
        noteDao.insert(noteEntity=noteEntity)
    }

    fun updateNote(noteEntity: NoteEntity){
        noteDao.update(noteEntity=noteEntity)
    }

    fun deleteNote(noteEntity: NoteEntity){
        noteDao.delete(noteEntity=noteEntity)
    }

}

