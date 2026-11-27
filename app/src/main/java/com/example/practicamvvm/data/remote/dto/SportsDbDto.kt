package com.example.practicamvvm.data.remote.dto

data class SportsDbResponseDto(
    val teams: List<SportsDbTeamDto>?
)

data class SportsDbTeamDto(
    val strTeam: String?,
    val strStadium: String?,
    val strDescriptionEN: String?,
    val strBadge: String?
)