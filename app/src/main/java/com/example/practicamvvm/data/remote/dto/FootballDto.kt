package com.example.practicamvvm.data.remote.dto

data class FootballTeamsResponseDto(
    val teams: List<FootballTeamDto>
)

data class FootballTeamDto(
    val id: Int,
    val name: String,
    val shortName: String?,
    val crest: String?,
    val founded: Int?,
    val venue: String?
)