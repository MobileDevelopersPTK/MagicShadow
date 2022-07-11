package com.example.project.model

import com.example.project.model.api.data.Auth
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.POST

interface Query {

    // Авторизация
    @POST("user/authorization.php")
    @Headers("Content-Type: application/json")
    fun checkAuthUser() : Call<ArrayList<Auth>>

}