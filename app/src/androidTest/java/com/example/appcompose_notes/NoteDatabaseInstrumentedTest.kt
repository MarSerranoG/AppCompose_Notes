package com.example.appcompose_notes

import android.content.Context
import androidx.room.Room
import androidx.test.core.app.ApplicationProvider
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.example.appcompose_notes.data.notes.NoteDao
import com.example.appcompose_notes.data.notes.NoteDatabase
import com.example.appcompose_notes.data.notes.NoteEntity
import org.junit.After
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import java.io.IOException

@RunWith(AndroidJUnit4::class)
class SimpleEntityReadWriteTest {
    private lateinit var noteDao: NoteDao
    private lateinit var db: NoteDatabase

    @Before
    fun createDb() {
        val context = ApplicationProvider.getApplicationContext<Context>()
        db = Room.inMemoryDatabaseBuilder(
            context, NoteDatabase:: class.java).build()
        noteDao = db.noteDao()
    }

    @After
    @Throws(IOException::class)
    fun closeDb() {
        db.close()
    }

    @Test
    @Throws(Exception::class)
    fun writeNoteAndReadAllNotes() {
        val titleNote = "Viaje"
        //Crear una instancia de notas
        val noteEntity = NoteEntity(uid = 1, titleNote = titleNote, bodyNote = "Alistar todo" )

        //insertar

        noteDao.insert(noteEntity)

        //leer la bd
        val notes = noteDao.getAll()

        //borrar

        noteDao.delete(noteEntity)

        //mostrar lista de notas por consola
        println(notes)

        //probamos el resultado esperado
        assertEquals(notes[0].titleNote, titleNote)
    }
}