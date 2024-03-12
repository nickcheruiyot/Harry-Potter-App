package com.example.developmentapp.domain.repository

import com.example.developmentapp.domain.model.HarryPotter
import com.swayy.trainapp.util.Resource

interface CharactersRepository {
    suspend fun getCharacters(): Resource<ArrayList<HarryPotter>>
}