package com.example.neostore.ViewModel

import android.content.ContentValues.TAG
import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.neostore.models.DefaultResponse
import dagger.hilt.android.lifecycle.HiltViewModel
import dagger.hilt.android.scopes.ViewModelScoped
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val repo : Repository
) :ViewModel(){

    val ResponseLiveData = MutableLiveData<DefaultResponse>()

    fun getLoginCredential(email : String , password : String){
        viewModelScope.launch(Dispatchers.IO){
            val response = repo.getLoginValidation(email,password)
            if(response.isSuccessful){
                ResponseLiveData.postValue(response.body())
            }else{
                Log.d(TAG, "getLoginCredential: Something went wrong")
            }

        }
    }


}