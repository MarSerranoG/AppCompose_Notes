package com.example.appcompose_notes.di

import android.content.Context
import androidx.room.Room
import com.example.appcompose_notes.data.notes.local.NoteDao
import com.example.appcompose_notes.data.notes.local.NoteDatabase
import com.example.appcompose_notes.utils.Constants
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn (SingletonComponent::class)
@Module
object AppModule {
    @Provides
    @Singleton
    fun providesNotesRoomDatabase(@ApplicationContext appN: Context): NoteDatabase = Room.databaseBuilder(
            appN,
            NoteDatabase::class.java,
            Constants.note_database).build()
 @Provides
 @Singleton
 fun providesNotesDao(noteDatabase: NoteDatabase): NoteDao = noteDatabase.noteDao()


}