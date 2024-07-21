package com.example.developmentapp.data.local.dao

import androidx.room.TypeConverter
import com.example.developmentapp.data.dto.Wand

class Converters {
    @TypeConverter
    fun fromList<String>(alternate_actors: List<String>): String{
        return alternate_actors.name
    }
    @TypeConverter
    fun toList<String>(name: String): List<String> {
        return List<String>(name, name)
    }
    @TypeConverter
    fun toWand(name: String): Wand {
        return Wand(name, name)
    }

    @TypeConverter
    fun fromWand(wand: Wand): String{
        return wand.name
    }

}