package com.example.developmentapp.data.local.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Upsert
import com.example.developmentapp.domain.model.HarryPotter

@Dao

interface CharactersDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertCharacters(Characters: List<HarryPotter>)

    @Query("SELECT * FROM Character_table")
    fun getCharacter(): List<HarryPotter>

    @Query("DELETE FROM Character_table")
    suspend fun deleteAllCharacters()
}