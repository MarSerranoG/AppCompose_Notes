package com.example.appcompose_notes.data.tasks.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.appcompose_notes.data.tasks.local.TaskDao
import com.example.appcompose_notes.data.tasks.model.TaskEntity

@Database(entities = [TaskEntity::class], version = 1)
abstract class TaskDatabase : RoomDatabase() {
    abstract fun taskDao(): TaskDao
}