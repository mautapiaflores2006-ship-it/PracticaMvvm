package com.example.practicamvvm.data.remote

import com.example.practicamvvm.data.remote.api.FootballApi
import com.example.practicamvvm.data.remote.api.SportsDbApi
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitClient {

    val footballApi: FootballApi = Retrofit.Builder()
        .baseUrl("https://api.football-data.org/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()
        .create(FootballApi::class.java)

    val sportsDbApi: SportsDbApi = Retrofit.Builder()
        .baseUrl("https://www.thesportsdb.com/api/v1/json/3/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()
        .create(SportsDbApi::class.java)
}