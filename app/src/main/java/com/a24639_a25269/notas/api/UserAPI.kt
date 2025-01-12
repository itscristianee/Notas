package com.a24639_a25269.notas.api

import com.a24639_a25269.notas.models.UserRequest
import com.a24639_a25269.notas.models.UserResponse
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.POST

interface UserAPI {

    @POST("/user/login")
    suspend fun signup(@Body userRequest: UserRequest): Response<UserResponse>

    @POST("/user/login")
    suspend fun signin(@Body userRequest: UserRequest): Response<UserResponse>

}