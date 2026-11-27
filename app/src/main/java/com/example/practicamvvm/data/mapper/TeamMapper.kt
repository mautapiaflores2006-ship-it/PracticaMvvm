package com.example.practicamvvm.data.mapper

import com.example.practicamvvm.data.remote.dto.FootballTeamDto
import com.example.practicamvvm.data.remote.dto.SportsDbTeamDto
import com.example.practicamvvm.model.Team

fun toTeam(football: FootballTeamDto, sports: SportsDbTeamDto?): Team {
    return Team(
        id = football.id,
        name = football.name,
        crest = football.crest,
        founded = football.founded,
        stadium = sports?.strStadium ?: football.venue,
        description = sports?.strDescriptionEN
    )
}