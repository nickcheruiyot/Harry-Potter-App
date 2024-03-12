package com.example.developmentapp.presentation

import com.example.developmentapp.domain.model.HarryPotter

data class CharactersState(
    val isLoading:Boolean = false,
    val error: String? = null,
    val characters:ArrayList<HarryPotter> = ArrayList()
)
