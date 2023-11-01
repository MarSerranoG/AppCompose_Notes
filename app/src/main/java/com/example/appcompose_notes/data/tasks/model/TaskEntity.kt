package com.example.appcompose_notes.data.tasks.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.appcompose_notes.utils.Constants

@Entity(tableName = Constants.task_table_name)
data class TaskEntity(
    @PrimaryKey val uid: Int,
    @ColumnInfo(name = "tileTask") val titleTask: String,
    @ColumnInfo(name = "bodyTask") val bodyTask: String,
    //@ColumnInfo(name = "locationTask") val locationTask: String?
)

