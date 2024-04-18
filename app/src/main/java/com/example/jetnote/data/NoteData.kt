package com.example.jetnote.data

import com.example.jetnote.models.Note

class NoteDataSource {
       fun loadNotes(): List<Note> {
           return listOf(
               Note(title = "A good boy", description = "fucker,"),
               Note(title = "A good boy", description = "fucker,"),
               Note(title = "A good boy", description = "fucker,")
           )
       }
}