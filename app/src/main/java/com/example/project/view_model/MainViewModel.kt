package com.example.project.view_model

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.project.model.api.data.Auth
import com.example.project.model.api.data.RetrofitInstance.Companion.service
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import java.util.ArrayList

class MainViewModel : ViewModel() {
    val auth: MutableLiveData<ArrayList<Auth>> = MutableLiveData()
    fun getProducts(number: String) {
        when (number) {
            "auth" ->
            {
                service.checkAuthUser().enqueue(object : Callback<ArrayList<Auth>> {
                    override fun onResponse(
                        call: Call<ArrayList<Auth>>,
                        response: Response<ArrayList<Auth>>
                    ) {
                        if (response.isSuccessful) auth.value = response.body()
                    }

                    override fun onFailure(call: Call<ArrayList<Auth>>, t: Throwable) {
                        Log.i("TAG", "Не удачно $call $t")
                    }
                })
            }

        }
    }

}


