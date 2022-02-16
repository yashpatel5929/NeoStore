package com.example.neostore.DI

import com.example.neostore.api.API
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object module{

    val BaseUrl = "http://staging.php-dev.in:8844/trainingapp/api/"

    @Provides
    @Singleton
    fun getRetrofitInstance():Retrofit{
        return Retrofit.Builder()
            .baseUrl(BaseUrl)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    @Provides
    @Singleton
    fun getInterfaceServices(retrofit: Retrofit):API{
        return  retrofit.create(API::class.java)
    }
}