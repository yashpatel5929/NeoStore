package com.example.neostore.ViewModel

import com.example.neostore.api.API
import com.example.neostore.models.DefaultResponse
import retrofit2.Response
import javax.inject.Inject

class Repository @Inject constructor(
    private val ApiService : API
) {

    fun getLoginValidation(email : String , password : String) : Response<DefaultResponse>{
        val response = ApiService.loginUser(email , password )
        return response
    }
}