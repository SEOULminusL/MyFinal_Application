package com.example.myfinalapplication

import android.app.Application
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MyApp:Application() {
    companion object{
        var networkService : NetworkService
        val retrofit : Retrofit
        get() = Retrofit.Builder()
            .baseUrl("https://api.odcloud.kr/api/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        init{
            networkService = retrofit.create(NetworkService::class.java)
        }
    }
}