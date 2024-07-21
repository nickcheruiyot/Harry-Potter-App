package com.example.developmentapp.domain

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.developmentapp.data.local.dao.CharactersDao
import com.example.developmentapp.domain.model.HarryPotter

@Database(
    entities = [
        HarryPotter::class,
    ],
    version = 4,
    exportSchema = true
)

abstract class CharactersDatabase : RoomDatabase()
{
    abstract val charactersDao: CharactersDao

}
