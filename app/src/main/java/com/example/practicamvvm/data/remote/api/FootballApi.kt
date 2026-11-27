package com.example.practicamvvm.data.remote.api

import com.example.practicamvvm.data.remote.dto.FootballTeamsResponseDto
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Path

interface FootballApi {

    @GET("v4/competitions/{code}/teams")
    suspend fun getTeams(
        @Path("code") code: String,
        @Header("X-Auth-Token") token: String
    ): FootballTeamsResponseDto
}