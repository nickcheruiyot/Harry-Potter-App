package com.example.developmentapp.data

import com.example.developmentapp.data.dto.HarryPotterResponseDto
import retrofit2.http.GET

interface HarryPotterApi {
    @GET("characters")
   suspend fun getCharacters():HarryPotterResponseDto
}