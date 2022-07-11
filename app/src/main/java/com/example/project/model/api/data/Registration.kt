package com.example.project.model.api.data

import com.google.gson.annotations.SerializedName

data class Registration (
    @SerializedName("first_name")
    val name: String,
    @SerializedName("last_name")
    val lname: String,
    @SerializedName("nickname")
    val nick: String,
    @SerializedName("phone")
    val phone: String,
    @SerializedName("hiding")
    val hiding: Int
    )