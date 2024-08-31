package com.example.developmentapp.data.repository

import com.example.developmentapp.data.HarryPotterApi
import com.example.developmentapp.data.mapper.toDomain
import com.example.developmentapp.domain.model.HarryPotter
import com.example.developmentapp.domain.repository.CharactersRepository
import com.swayy.trainapp.util.Resource
import com.swayy.trainapp.util.safeApiCall
import kotlinx.coroutines.Dispatchers

class CharactersRepositoryImpl(
    private val harryPotterApi: HarryPotterApi
) : CharactersRepository {
    override suspend fun getCharacters(): Resource<ArrayList<HarryPotter>> {
        return safeApiCall(Dispatchers.IO) {
            val response = harryPotterApi.getCharacters()

            val result = response.map { it.toDomain() }

            ArrayList(result)
        }
    }
}
















































































































































