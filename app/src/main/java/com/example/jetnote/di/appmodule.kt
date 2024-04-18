package com.example.jetnote.di

import android.content.Context
import androidx.room.Room
import com.example.jetnote.data.NoteDatabase
import com.example.jetnote.data.NoteDatabaseDao
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
object AppModule {

    @Singleton//one instance of the particular item
    @Provides//provides something here.
    fun providesNoteDao(noteDatabase: NoteDatabase): NoteDatabaseDao = noteDatabase.noteDao()

    @Singleton
    @Provides
     fun provideAppDatabase(@ApplicationContext context: Context): NoteDatabase
     = Room.databaseBuilder(context, NoteDatabase::class.java, "notes_db").
    fallbackToDestructiveMigration().build()

}