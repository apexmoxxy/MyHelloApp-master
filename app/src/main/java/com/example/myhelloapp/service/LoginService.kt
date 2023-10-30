package com.example.myhelloapp.service

import com.example.myhelloapp.data.LoginData
import com.example.myhelloapp.respon.LoginRespon
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST

interface LoginService {
    @POST("auth/local")
    fun getData(@Body body: LoginData) : Call<LoginRespon>
}