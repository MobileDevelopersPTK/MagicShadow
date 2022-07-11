package com.example.project.model.api.data

import com.google.gson.annotations.SerializedName

data class Auth(
    @SerializedName("phone")
    val phone: String
)