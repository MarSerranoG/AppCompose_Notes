package com.example.appcompose_notes.data.notes

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.appcompose_notes.utils.Constants

@Entity(tableName = Constants.note_table_name)
data class NoteEntity(
    @PrimaryKey val uid: Int,
    @ColumnInfo(name = "tileNote") val titleNote: String,
    @ColumnInfo(name = "bodyNote") val bodyNote: String,
    //@ColumnInfo(name = "dateNote") val bodyDate: String?,
    //@ColumnInfo(name = "TaskId") val taskId: Long?,
    //@ColumnInfo(name = "locationNote") val locationNote: String?

)

