package com.example.practicamvvm.data.remote.api

import com.example.practicamvvm.data.remote.dto.SportsDbResponseDto
import retrofit2.http.GET
import retrofit2.http.Query

interface SportsDbApi {

    @GET("searchteams.php")
    suspend fun searchTeam(
        @Query("t") teamName: String
    ): SportsDbResponseDto
}