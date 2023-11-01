package com.example.appcompose_notes.data.tasks

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.example.appcompose_notes.utils.Constants

@Dao
interface TaskDao {
    @Query("SELECT * FROM ${Constants.task_table_name}")
    fun getAll(): List<TaskEntity>

    @Insert
    fun insertAll(taskEntity: TaskEntity)

    @Delete
    fun delete(taskEntity: TaskEntity)

    @Update
    fun update(taskEntity: TaskEntity)
}