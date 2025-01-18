package com.a24639_a25269.notas

import android.text.TextUtils
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.a24639_a25269.notas.models.UserRequest
import com.a24639_a25269.notas.models.UserResponse
import com.a24639_a25269.notas.repository.UserRepository
//import com.a24639_a25269.notas.utils.Helper
//import com.a24639_a25269.notas.utils.NetworkResult
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class AuthViewModel @Inject constructor(private  val userRepository: UserRepository) : ViewModel() {


   fun registerUser(userRequest: UserRequest){
        viewModelScope.launch {
            userRepository.registerUser(userRequest)
        }
    }

    fun loginUser(userRequest: UserRequest){
        viewModelScope.launch {
            userRepository.loginUser(userRequest)
        }
    }


}