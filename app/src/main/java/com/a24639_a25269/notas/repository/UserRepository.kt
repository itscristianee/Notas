package com.a24639_a25269.notas.repository

import android.util.Log
import com.a24639_a25269.notas.api.UserAPI
import com.a24639_a25269.notas.models.UserRequest
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.a24639_a25269.notas.models.UserResponse
import com.a24639_a25269.notas.utils.Constants.TAG
//import com.a24639_a25269.notas.utils.NetworkResult
import org.json.JSONObject
import retrofit2.Response
import javax.inject.Inject

class UserRepository @Inject constructor (private val userAPI: UserAPI){

    suspend fun registerUser(userRequest: UserRequest) {
        val response = userAPI.signup(userRequest)
        Log.d(TAG, response.body().toString())
    }

    suspend fun loginUser(userRequest: UserRequest) {
        val response =userAPI.signin(userRequest)
        Log.d(TAG, response.body().toString())
    }


}