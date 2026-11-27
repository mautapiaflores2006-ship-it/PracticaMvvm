package com.example.practicamvvm.ui

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.practicamvvm.data.repository.TeamRepository
import com.example.practicamvvm.model.Team
import kotlinx.coroutines.launch

class TeamViewModel : ViewModel() {

    private val repository = TeamRepository()

    var teams by mutableStateOf<List<Team>>(emptyList())
        private set

    var isLoading by mutableStateOf(false)
        private set

    var error by mutableStateOf<String?>(null)
        private set

    init {
        loadTeams("PL")
    }

    fun loadTeams(competitionCode: String) {
        viewModelScope.launch {
            isLoading = true
            error = null
            try {
                teams = repository.getTeams(competitionCode)
            } catch (e: Exception) {
                error = "No se pudieron cargar los equipos: ${e.message}"
            }
            isLoading = false
        }
    }
}