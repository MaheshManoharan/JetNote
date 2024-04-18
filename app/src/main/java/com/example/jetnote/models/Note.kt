package com.example.jetnote.models

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.time.LocalDateTime
import java.time.LocalDateTime.now
import java.util.UUID

@Entity(tableName = "notes_tbl")
data class Note(
    @PrimaryKey
     val id: UUID = UUID.randomUUID(),
    @ColumnInfo(name = "note_title")
    val title: String,
    @ColumnInfo("note_description")
    val description: String,
    @ColumnInfo(name = "note_entry_date")
    val entryDate: LocalDateTime = now()
)