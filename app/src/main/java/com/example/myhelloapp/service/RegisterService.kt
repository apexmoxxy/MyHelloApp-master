package com.example.myhelloapp.service

import com.example.myhelloapp.respon.LoginRespon
import com.example.myhelloapp.data.RegisterData
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST

interface RegisterService {
    @POST("auth/local/register")
    fun saveData(@Body body: RegisterData) : Call<LoginRespon>
}