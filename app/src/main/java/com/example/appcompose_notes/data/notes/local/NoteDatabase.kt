package com.example.appcompose_notes.data.notes.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.appcompose_notes.data.notes.model.NoteEntity
import com.example.appcompose_notes.data.notes.local.NoteDao

@Database(entities = [NoteEntity::class], version = 1)
abstract class NoteDatabase : RoomDatabase() {
    abstract fun noteDao(): NoteDao
}