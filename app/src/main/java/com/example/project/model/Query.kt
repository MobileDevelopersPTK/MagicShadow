package com.example.project.model

import com.example.project.model.api.data.Auth
import com.example.project.model.api.data.Registration
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.POST

interface Query {

    // Авторизация
    @POST("user/authorization.php")
    @Headers("Content-Type: application/json")
    fun checkAuthUser() : Call<ArrayList<Auth>>

    // Регистрация
    @POST("user/registration.php")
    @Headers("Content-Type: application/json")
    fun registration() : Call<ArrayList<Registration>>

}