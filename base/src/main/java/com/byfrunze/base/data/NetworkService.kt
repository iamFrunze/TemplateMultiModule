package com.byfrunze.base.data

import retrofit2.Retrofit

class NetworkService {

    fun provideRetrofit(): Retrofit {
        return Retrofit.Builder()
            .build()
    }
}