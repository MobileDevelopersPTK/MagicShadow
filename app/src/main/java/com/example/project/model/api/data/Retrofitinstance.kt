package com.example.project.model.api.data

import com.example.project.model.Query
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitInstance {

    companion object {
        private fun retrofitInstance(): Retrofit {
            val httpLoggingInterceptor = HttpLoggingInterceptor()
            httpLoggingInterceptor.level = HttpLoggingInterceptor.Level.BODY

            val okHttpClient = OkHttpClient.Builder()
                .addInterceptor(httpLoggingInterceptor)
                .build()

            return Retrofit.Builder()
                .baseUrl("http://a0693929.xsph.ru/")
                .client(okHttpClient)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
        }

        val service: Query = retrofitInstance().create(Query::class.java)
    }
}