package com.example.practicamvvm.data.repository

import com.example.practicamvvm.data.mapper.toTeam
import com.example.practicamvvm.data.remote.RetrofitClient
import com.example.practicamvvm.model.Team

class TeamRepository {

    private val token = "d2a43742b3744ac4ab702b6536eb857d"

    suspend fun getTeams(competitionCode: String): List<Team> {
        val footballTeams = RetrofitClient.footballApi
            .getTeams(competitionCode, token)
            .teams

        return footballTeams.map { footballDto ->
            val sportsDto = try {
                RetrofitClient.sportsDbApi
                    .searchTeam(footballDto.shortName ?: footballDto.name)
                    .teams
                    ?.firstOrNull()
            } catch (e: Exception) {
                null
            }
            toTeam(footballDto, sportsDto)
        }
    }
}