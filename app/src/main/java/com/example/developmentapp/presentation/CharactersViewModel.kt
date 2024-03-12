package com.example.developmentapp.presentation

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.developmentapp.domain.repository.CharactersRepository
import com.swayy.trainapp.util.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class CharactersViewModel @Inject constructor(
    private val repository: CharactersRepository
) : ViewModel() {

    private val _state = mutableStateOf(CharactersState())
    val state: State<CharactersState> = _state

    init {
        getCharacters()
    }

    fun getCharacters() {
        viewModelScope.launch {
            when (val result = repository.getCharacters()) {
                is Resource.Loading -> {
                    _state.value = CharactersState(isLoading = false, error = result.message)
                }

                is Resource.Success -> {
                    _state.value = CharactersState(isLoading = false, characters = result.data!!)
                }

                else -> {
                    state
                }
            }
        }
    }
}