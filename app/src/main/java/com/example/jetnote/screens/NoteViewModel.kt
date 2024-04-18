package com.example.jetnote.screens

import androidx.compose.runtime.mutableStateListOf
import androidx.lifecycle.ViewModel
import com.example.jetnote.data.NoteDataSource
import com.example.jetnote.models.Note

class NoteViewModel : ViewModel()
{
    var noteList = mutableStateListOf<Note>()

    init {
        noteList.addAll(NoteDataSource().loadNotes())
    }

    fun addNote(note: Note){
        noteList.add(note)
    }

    fun removeNote(note: Note){
    noteList.remove(note)
    }

    fun getAllNotes(): List<Note> {
        return noteList
    }



}